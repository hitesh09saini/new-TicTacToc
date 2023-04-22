

public class mainpattern {
    

    public static void pattern(String s) {
        namepattern n = new namepattern();
        char c = ' ';
        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);

            switch (c) {
                case 'a':
                    n.A();
                    break;

                case 'b':
                    n.B();
                    break;
                case 'c':
                    n.C();
                    break;
                case 'd':
                    n.D();
                    break;
                case 'e':
                    n.E();
                    break;
                case 'f':
                    n.F();
                    break;
                case 'g':
                    n.G();
                    break;
                case 'h':
                    n.H();
                    break;
                case 'i':
                    n.I();
                    break;
                case 'j':
                    n.J();
                    break;
                case 'k':
                    n.K();
                    break;
                case 'l':
                    n.L();
                    break;
                case 'm':
                    n.M();
                    break;
                case 'n':
                    n.N();
                    break;
                case 'o':
                    n.O();
                    break;
                case 'p':
                    n.P();
                    break;
                case 'q':
                    n.Q();
                    break;
                case 'r':
                    n.R();
                    break;
                case 's':
                    n.S();
                    break;
                case 't':
                    n.T();
                    break;
                case 'u':
                    n.U();
                    break;
                case 'v':
                    n.V();
                    break;
                case 'w':
                    n.W();
                    break;
                case 'x':
                    n.X();
                    break;
                case 'y':
                    n.Y();
                    break;
                case 'z':
                    n.Z();
                    break;
            }
        }
    }
}
