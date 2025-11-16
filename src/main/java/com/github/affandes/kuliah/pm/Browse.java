package com.github.affandes.kuliah.pm;

public class Browse {
    public Stack<String> history = new Stack<>();
    public boolean menuBack;
    public void browse(String website) {
        history.push(website);
        menuBack = true;
        System.out.println("Browsing: " + website);
    }

    public void back() {
        if (history.isEmpty()) {
            menuBack = false;
        }

        String removed = history.pop();
        System.out.println("Kembali dari: " + removed);

        if (history.isEmpty()) {
            menuBack = false;
        }else {
            System.out.println("Sekarang di: " + history.peek());
        }
    }

    public void view() {
        System.out.println("\n=== HISTORY (Dari paling baru) ===");
        if (history.isEmpty()) {
            System.out.println("History kosong.");
        } else {
            history.printStack();
        }
        System.out.println("================================\n");
    }
}
