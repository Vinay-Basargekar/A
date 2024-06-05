interface Exam {
    static final int marks1 = 70;
    static final int marks2 = 80;

    void display();
}

class Sports {
    int score;

    void accept(int s) {
        score = s;
    }
}

class Result extends Sports implements Exam {
    public void display() {
        System.out.println("Total=" + (marks1 + marks2 + score));
    }

    public static void main(String args[]) {
        Result r = new Result();
        r.accept(60);
        r.display();
    }
}
