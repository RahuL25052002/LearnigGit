

class parent {
    Object fun() {
        System.out.println("Rahul");
        return new Object();
    }
}

class child extends parent {
    @Override
    String fun() {
        System.out.println("Nikale");
        return "Nikale";
    }
}

class  overridingExample {
    public static void main(String[] args) {
        child obj = new child();
        obj.fun();
    }
}

