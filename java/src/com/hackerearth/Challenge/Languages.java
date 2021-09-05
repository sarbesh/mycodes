public class Languages{
    public static void main(String[] args) {
        LanguagesE ap;
        for(LanguagesE a: LanguagesE.values()){
            System.out.println(a+" "+a.getCoders()+" coders.");
        }
    }
}

enum LanguagesE {
    Python(10-10+10*10), Java(9+9*9-9), Angular(12*12-12-12);
    private int coders;
    LanguagesE(int p){
        coders = p;
    }
    int getCoders(){
        return coders;
    }
}
