import java.util.Scanner;
public class Funcoes
{
        Scanner sc = new Scanner(System.in);
        // Parte 1
        void VelocidadeMedia() {
            System.out.print("\nQual a posição inicial(Si): ");
                int Si=sc.nextInt();
            System.out.print("Qual a posição final(S): ");
                int S=sc.nextInt();
            System.out.print("Qual o tempo inicial(Ti): ");
                int Ti=sc.nextInt();
            System.out.print("Qual o tempo Final(T): ");
                int T=sc.nextInt();
                float V = (S-Si)/(T-Ti);
            System.out.println("\u001B[34mA velocidade média é: "+ V+"Km/h");
        }
        // Parte 2
        void MovimentoUniforme() {
            System.out.println("\n\u001B[35mOpções\u001B[0m");
            System.out.println("[1] Calcular a posição [S = Si+(V*T)]");
            System.out.println("[2] Calcular o tempo [T = (S - Si)/V]");
            System.out.print("\u001B[36mEscolha: \u001B[0m");
                int mov=sc.nextInt();
                
            switch (mov) {
            case 1:
                System.out.print("\nQual a posição inicial(Si): ");
                    int Si=sc.nextInt();
                System.out.print("Qual a velocidade media(V): ");
                    int V=sc.nextInt();
                System.out.print("Qual o tempo final(T): ");
                    int T=sc.nextInt();
                    int S = Si+(V*T);
                System.out.println("\u001B[34mA sua posição é: "+S+"m");
            break;
                case 2:
                    System.out.print("Qual a posição inicial(Si): ");
                        Si=sc.nextInt();
                    System.out.print("\nQual a posição final(S): ");
                        S=sc.nextInt();
                    System.out.print("Qual a velocidade media(V): ");
                        V=sc.nextInt();
                        T = (S - Si)/V;
                    System.out.println("\u001B[34mO tempo é: "+T+"s");
                break;
            default: 
                System.out.println("Erro. Escolha alguma opção certa");
            break;
            }
        }
        // Parte 3
        void AceleracaoMedia() {
             System.out.print("\nQual a velocidade inicial(Vi): ");
                int Vi=sc.nextInt();
             System.out.print("Qual a velocidade final(V): ");
                int V=sc.nextInt();
             System.out.print("Qual o tempo inicial(Ti): ");
                int Ti=sc.nextInt();
             System.out.print("Qual o tempo final(T): ");
                int T=sc.nextInt();
                int a = (V-Vi)/(T-Ti);
             System.out.println("\u001B[34mA aceleração é: "+a+"m/s");
        }
        // Parte 4
        void FunçãoHorariaDaVelocidade() {
            System.out.print("\nQual a velocidade inicial(Vi): ");
                int Vi=sc.nextInt();
            System.out.print("Qual a aceleração(a): ");
                int a=sc.nextInt();
            System.out.print("Qual o tempo(T): ");
                int T=sc.nextInt();
                int V = Vi+(a*T);
            System.out.println("\u001B[34mA velocidade é: "+V+"m/s");
    }
        // Parte 5
        void FunçãoHorariaDasPosições() {
            System.out.print("\nQual a posição inicial(Si): ");
                int Si=sc.nextInt();
            System.out.print("Qual a velocidade inicial(Vi): ");
                int Vi=sc.nextInt();
            System.out.print("Qual o tempo(T): ");
                int T=sc.nextInt();
            System.out.print("Qual a aceleração(a): ");
                int a=sc.nextInt();
                int S = (Si+(Vi*T))+((a*(T*T))/2);
            System.out.println("\u001B[34mA sua posição é :"+S+"m");
        }
        // Parte 6
        // falta fazer o metodo da exaustão, para ficar com 
        // a resposta completa.
        void EquaçãoDeTorricelli() {
            System.out.print("\nQual é a velocidade inicial(Vi): ");
                int Vi=sc.nextInt();
            System.out.print("Qual a aceleração(a): ");
                int a=sc.nextInt();
            System.out.print("Qual a posição(ΔS): ");
                int ΔS=sc.nextInt();
                Vi = Vi*Vi;
                int V = Vi+(2*a*ΔS);
            System.out.println("\u001B[34mA raíz quadrada vai ficar: √"+V);
        }
        // Parte 7
        void LVC() {
            System.out.println("/n\u001B[35mOpções\u001B[0m");
            System.out.println("[1] [H = Hi-(Vi*T)-(g*T²/2)]");
            System.out.println("[2] [V = -Vi-g*T]");
            System.out.println("[3] [V² = Vi²+2*g*ΔH]");
            System.out.print("\u001B[36mEscolha: \u001B[0m");
                int esc=sc.nextInt();
            
            switch (esc) {
                case 1:
                    System.out.print("\nQual a altura incial(Hi): ");
                        int Hi=sc.nextInt();
                    System.out.print("Qual a velocidade inicial(Vi): ");
                        int Vi=sc.nextInt();
                    System.out.print("Qual o tempo(T): ");
                        int T=sc.nextInt();
                    System.out.print("Qual a gravidade(g): ");
                        float g=sc.nextInt();
                        float H = (Hi+(Vi*T))-((g*(T*T))/2);
                    System.out.print("\u001B[34mA altura é: "+H+"m");
                break;
                    case 2:
                System.out.print("\nQual a velocidade inicial(Vi): ");
                        Vi=sc.nextInt();
                    System.out.print("Qual a gravidade(g): ");
                        g=sc.nextInt();
                    System.out.print("Qual o tempo(T): ");
                        T=sc.nextInt();
                        float V = -Vi-(g*T);
                    System.out.print("\u001B[34mA velocidade é: "+V+"s");
                    break;
                case 3:
                    System.out.print("\nQual a velocidade inicial(Vi): ");
                        Vi=sc.nextInt();
                    System.out.print("Qual a gravidade(g): ");
                        g=sc.nextInt();
                    System.out.print("Qual o delta da altura(ΔH): ");
                        int ΔH=sc.nextInt();
                        V = (Vi*Vi)+(2*g*ΔH);
                    System.out.print("\u001B[34mA raíz quadrada vai ficar: √"+V);
                break;
                    default: 
                        System.out.println("Erro. Escolha alguma opção certa");
                    break;
            }
        }
        // Parte 8
        void Q() {
            System.out.println("/n\u001B[35mOpções\u001B[0m");
            System.out.println("[1] [H = Hi-(Vi*T)-(g*T²/2)]");
            System.out.println("[2] [V = -Vi-g*T]");
            System.out.println("[3] [V² = 0-2*g*ΔH]");
            System.out.print("\u001B[36mEscolha: \u001B[0m");
                int esc=sc.nextInt();
            
            switch (esc) {
                case 1:
                    System.out.print("\nQual a altura incial(Hi): ");
                        int Hi=sc.nextInt();
                    System.out.print("Qual a velocidade inicial(Vi): ");
                        int Vi=sc.nextInt();
                    System.out.print("Qual o tempo(T): ");
                        int T=sc.nextInt();
                    System.out.print("Qual a gravidade(g): ");
                        float g=sc.nextInt();
                        float H = (Hi-(Vi*T))-((g*(T*T))/2);
                    System.out.print("\u001B[34mA altura é: "+H+"m");
                    
                break;
                    case 2:
                System.out.print("\nQual a velocidade inicial(Vi): ");
                        Vi=sc.nextInt();
                    System.out.print("Qual a gravidade(g): ");
                        g=sc.nextInt();
                    System.out.print("Qual o tempo(T): ");
                        T=sc.nextInt();
                        float V = -Vi-(g*T);
                    System.out.print("\u001B[34mA velocidade é: "+V+"s");
                    break;
                case 3:
                    System.out.print("\nQual a velocidade inicial(Vi): ");
                        Vi=sc.nextInt();
                    System.out.print("Qual a gravidade(g): ");
                        g=sc.nextInt();
                    System.out.print("Qual o delta da altura(ΔH): ");
                        int ΔH=sc.nextInt();
                        V = (-Vi*Vi)-(2*g*ΔH);
                    System.out.print("\u001B[34mA raíz quadrada vai ficar: √"+V);
                break;
                    default: 
                        System.out.println("Erro. Escolha alguma opção certa");
                    break;
        }
    }
        // parte 9
        void Ql() {
            System.out.println("\n\u001B[35mOpções\u001B[0m");
            System.out.println("[1] [H = Hi-(0*T)-(g*T²/2)]");
            System.out.println("[2] [V = 0-g*T]");
            System.out.println("[3] [V² = -Vi²+2*g*ΔH]");
            System.out.print("\u001B[36mEscolha: \u001B[0m");
                int esc=sc.nextInt();
            
            switch (esc) {
                case 1:
                    System.out.print("\nQual a altura incial(Hi): ");
                        int Hi=sc.nextInt();
                    System.out.print("Qual o tempo(T): ");
                        int T=sc.nextInt();
                    System.out.print("Qual a gravidade(g): ");
                        float g=sc.nextInt();
                        float H = (Hi-(0*T))-((g*(T*T))/2);
                    System.out.print("\u001B[34mA altura é: "+H+"m");
                    
                break;
                    case 2:
                        System.out.print("\nQual a gravidade(g): ");
                            g=sc.nextInt();
                        System.out.print("Qual o tempo(): ");
                            T=sc.nextInt();
                            float V = 0-(g*T);
                        System.out.print("\u001B[34mA velocidade é: "+V+"s");
                        break;
                case 3:
                    System.out.print("\nQual a gravidade(g): ");
                        g=sc.nextInt();
                    System.out.print("Qual o delta da altura(ΔH): ");
                        int ΔH=sc.nextInt();
                        V = 0-(2*g*ΔH);
                    System.out.println("\u001B[34mA raíz quadrada vai ficar: √"+V);
                break;
                    default: 
                        System.out.println("Erro. Escolha alguma opção certa");
                    break;
            }
        }
        // Parte 10
        void VelocidadeAngular() {
            System.out.println("\n\u001B[35mOpções\u001B[0m");
            System.out.println("[1] [W = Δθ/ΔT]");
            System.out.println("[2] [W = 2π/t]");
            System.out.print("\u001B[36mEscolha: \u001B[0m");
                int esc=sc.nextInt();
                
            switch (esc) {
                case 1:
                    System.out.print("\nQual o agulo inicial(θ1): ");
                        int θi=sc.nextInt();
                    System.out.print("Qual o angulo final(θ2): ");
                        int θ=sc.nextInt();
                    System.out.print("Qual o tempo inicial(Ti): ");
                        int Ti=sc.nextInt();
                    System.out.print("Qual o tempo final(T): ");
                        int T=sc.nextInt();
                        int W = (θ-θi)/(T-Ti);
                        W = 180/W;
                    System.out.println("\u001B[34mA velocidade angular é: "+W+"π rad/s");
                break;
                    case 2:
                        System.out.print("\nQual a periodo(T): ");
                            T=sc.nextInt();
                            W = 2*T;
                        System.out.print("\u001B[34mA velocidade angular é: "+W+"π rad/s");
                    break;
                        default: 
                            System.out.println("Erro. Escolha alguma opção certa");
                        break;
            }
        }
        // Parte 11
        void VelocidadeEscalar() {
            System.out.print("\nQual o raio(R): ");
                int R=sc.nextInt();
            System.out.print("Qual o periodo(T): ");
                int T=sc.nextInt();
                int V = (2*R)/T;
            System.out.println("\u001B[34mA velocidade escalar é: "+V+"π m/s");
        }
        // Parte 12
        void Pesos() {
            System.out.print("\n\u001B[35mQual seria o peso de alguma massa em todo o sistema solar\u001B[0m");
            System.out.println("[1] Terra");
            System.out.println("[2] Lua");
            System.out.println("[3] Mercúrio");
            System.out.println("[4] Vênus");
            System.out.println("[5] Marte");
            System.out.println("[6] Júpiter");
            System.out.println("[7] Saturno");
            System.out.println("[8] Urano");
            System.out.println("[9] Netuno");
            System.out.print("\u001B[36mEscolha: \u001B[0m");
                int esc=sc.nextInt();
                
                switch (esc) {
                    case 1:
                        System.out.print("Quantos kilos pesa: ");
                            int kg=sc.nextInt();
                            double val = kg*9.81;
                        System.out.println("\u001B[34mO seu peso na Terra é: "+val);
                    break;
                        case 2:
                            System.out.print("Quantos kilos pesa: ");
                                kg=sc.nextInt();
                                val = kg*1.6;
                            System.out.println("\u001B[34mO seu peso na Lua é: "+val);   
                        break;
                    case 3:
                        System.out.print("Quantos kilos pesa: ");
                            kg=sc.nextInt();
                            val = kg*3.7;
                        System.out.println("\u001B[34mO seu peso na Mercúrio é: "+val);
                    break;
                        case 4:
                            System.out.print("Quantos kilos pesa: ");
                            kg=sc.nextInt();
                            val = kg*8.87;
                        System.out.println("\u001B[34mO seu peso na Vênus é: "+val);
                        break;
                    case 5:
                        System.out.print("Quantos kilos pesa: ");
                            kg=sc.nextInt();
                            val = kg*3.71;
                        System.out.println("\u001B[34mO seu peso na Marte é: "+val);
                    break;
                        case 6:
                            System.out.print("Quantos kilos pesa: ");
                            kg=sc.nextInt();
                            val = kg*24.79;
                        System.out.println("\u001B[34mO seu peso na Júpiter é: "+val);
                        break;
                    case 7:
                        System.out.print("Quantos kilos pesa: ");
                            kg=sc.nextInt();
                            val = kg*10.44;
                        System.out.println("\u001B[34mO seu peso na Saturno é: "+val);
                    break;
                        case 8:
                            System.out.print("Quantos kilos pesa: ");
                            kg=sc.nextInt();
                            val = kg*8.69;
                        System.out.println("\u001B[34mO seu peso na Urano é: "+val);
                        break;
                    case 9:
                        System.out.print("Quantos kilos pesa: ");
                            kg=sc.nextInt();
                            val = kg*11.15;
                        System.out.println("\u001B[34mO seu peso na Netuno é: "+val);
                    break;
                        default: 
                            System.out.println("Erro. Escolha alguma opção certa");
                        break;
                }
            
        }
    // Parte 13
    void EscalaTermica() {
         System.out.print("\n\u001B[35mQual temperatura deseja calcular?\u001B[0m");
         System.out.println("");
         System.out.println("\n[1] \u001B[32mCelsius (°C)\u001B[0m para \u001B[34mFahrenheit (°F)\u001B[0m");
         System.out.println("[2] \u001B[34mFahrenheit (°F)\u001B[0m para \u001B[32mCelsius (°C)\u001B[0m");
         System.out.println("[3] Kelvin (°K) para \u001B[32mCelsius (°C)\u001B[0m");
         System.out.println("[4] \u001B[32mCelsius (°C)\u001B[0m para Kelvin (°K)");
         System.out.println("[5] Kelvin (°K) para \u001B[34mFahrenheit (°F)\u001B[0m");
         System.out.println("[6] \u001B[34mFahrenheit (°F)\u001B[0m para Kelvin (°K)");
         System.out.print("\u001B[36mEscolha: \u001B[0m");
         int esc=sc.nextInt();
         
         switch (esc){
             case 1:
                 System.out.println("Digite quantos graus em °C");
                 float Tc=sc.nextInt();
                 float total= Tc/5;
                 total = (total*9)+ 32;
                 System.out.println("\u001B[34mFicou "+total+"°F");
             break;
                case 2:
                     System.out.println("Digite quantos graus em °F");
                     float Tf=sc.nextInt();
                     total = (Tf- 32)/9;
                     total = total*5;
                     System.out.println("\u001B[34mFicou "+total+"°C");
                break;
             case 3:
                 System.out.println("Digite quantos graus em °K");
                 float Tk=sc.nextInt();
                 total = Tk- 273;
                 System.out.println("\u001B[34mFicou "+total+"°C");
             break;
                case 4:
                 System.out.println("Digite quantos graus em °C");
                 float Tk=sc.nextInt();
                 total = Tk+ 273;
                 System.out.println("\u001B[34mFicou "+total+"°K");
                break;
            case 5:
                 System.out.println("Digite quantos graus em °K");
                 Tk=sc.nextInt();
                 total = (Tk- 273)/5;
                 total = (total*9)+ 32;
                 System.out.println("\u001B[34mFicou "+total+"°F");
             break;
                case 6:
                 System.out.println("Digite quantos graus em °F");
                 Tk=sc.nextInt();
                 total = (Tf- 32)/9;
                 total = (total*5)+ 273;
                 System.out.println("\u001B[34mFicou "+total+"°K");
                break;
                default: 
                    System.out.println("Erro. Escolha alguma opção certa");
                break;
         }
    }
}
