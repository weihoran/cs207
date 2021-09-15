public class test {

    public static void main(String[] args){

        float a = 1.0f - 0.9f;
        float b = 0.9f - 0.8f;
        System.out.println(a==b);

        float k = 0.9f;
        System.out.println(k);
        System.out.printf("%10.10f",k);

        double c = 1.0d - 0.9d;
        double d = 0.99d - 0.89d;
        System.out.println(c==d);
        float e =1f;
        float f = 0.99999999f;



        System.out.println(e==f);

        //correct comparison
        float diff =1e-6f;
        if(Math.abs(a-b)<diff)
            System.out.println(true);



        double sum;
        sum = 300000000 + 0.0000000001;
        System.out.println(sum);

    }










}
