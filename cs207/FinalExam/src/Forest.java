public class Forest {

    private String name;


    private Forest(String name){
        //super();
        this.name = name;
    }


    class pair{
        private pair(){}
    }




    public void main(String[] args){
        pair p = new pair();
    }





    public void flip(){
        if(isOn == false)
            isOn=true;
        else {
            isOn = false;
            setChanged();
            NotifyObservers();
        }

    }


    public void update(Observable o, Object arg) {
        flip();
    }

    for (int i = O; i !=bits.length; i++) {
        bits[i+1].addObserver(bits[i]);
    }



  100   101
  110   1001

    public void increment() {
        bits[0].flip();
    }

}
