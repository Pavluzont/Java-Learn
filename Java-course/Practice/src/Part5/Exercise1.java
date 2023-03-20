package Part5;

public class Exercise1 {
    public static void main(String[] args) {
        //  H    G    F    E    D    C    B    A
        // 128   64   32   16   8    4    2    1
        int signalABC = 1 | 2 | 4;
        int signalAD = 1 | 8;
        int signalADC = 1 | 8 | 4;

        System.out.println(signalABC);
        System.out.println(signalAD);
        System.out.println(signalADC);

        // test if signal D is present in ADC
        int signalD = 8;
        System.out.println((signalADC & signalD) == signalD);
    }
}
