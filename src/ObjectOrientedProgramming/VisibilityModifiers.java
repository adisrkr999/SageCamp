package ObjectOrientedProgramming;

 public class VisibilityModifiers {
    public int p = 2;
    int d = 22;
    private int pr = 222;

    public void testPublicMethod(){
        System.out.println("inside testPublicMethod");
    }
    void testDefaultMethod(){
        System.out.println("inside testDefaultMethod");
    }
    private void testPrivateMethod(){
        System.out.println("inside testPrivateMethod");
    }

    public static void main(String[] args) {
        VisibilityModifiers vm = new VisibilityModifiers();
        System.out.println(vm.pr);
        vm.testPrivateMethod();
        System.out.println(vm.d);
        System.out.println(vm.p);
        vm.testDefaultMethod();
        vm.testPublicMethod();

    }
}

//private member variables are not accessible through another
//class even if that class is in the same package. It
// is only accessible from the same class.

//default member variables are not accessible from a class
// under a different package. However, it is accessible from a
//class under  the same package.

//public member variables have no restrictions
