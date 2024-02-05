package ObjectOrientedProgramming;

public class TestModifiers {
    public static void main(String[] args) {
        VisibilityModifiers vm = new VisibilityModifiers();
        System.out.println(vm.d);
        System.out.println(vm.p);
        //System.out.println(vm.pr);

        vm.testDefaultMethod();
        vm.testPublicMethod();
        //vm.testPrivateMethod();
    }
}
