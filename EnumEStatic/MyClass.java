package EnumEStatic;
public class MyClass {
    // EXEMPLO 1
    public static void Method(){
        System.out.println("AAAAAA");
        //estatico é global
        //Coisas estaticas so podem acessar coisas estaticas
        // nao consigo atribuir uma intancia de uma varivel
        //nao vou poder usar polimorfismo e herança
    }
    // EXEMPLO 2
    public void MethodB(){
        Method();
    }

    private static Integer count = 0;
    public static void add(){
        count++;
    }
    public MyClass(){
        add();
        System.out.println(count);
    }

}
