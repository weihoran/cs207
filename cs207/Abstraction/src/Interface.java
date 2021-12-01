interface a {


    default void f1() {

    }
}

interface b {
    void f2();
}

interface c extends a, b{

}