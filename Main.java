import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Funcoes ps = new Funcoes();
		
		System.out.println("\u001B[35mEscolha alguma opção a seguir\u001B[0m");
		System.out.println("\n[1] Velocidade Média \u001B[33m[V = ΔS/ΔT]\u001B[0m");
		System.out.println("[2] Movimento Uniforme \u001B[33m[S = Si+(V*T)] | [T = (S - Si)/V]\u001B[0m");
		System.out.println("[3] Aceleração Média \u001B[33m[a = ΔV/ΔT]\u001B[0m");
		System.out.println("[4] Função Horaria Da Velocidade \u001B[33m[V = Vi+(a*T)]\u001B[0m");
		System.out.println("[5] Função Horaria Das Posições \u001B[33m[S = (Si+(Vi*T))+((a*T²)/2)]\u001B[0m");
		System.out.println("[6] Equaçao de Torricelli \u001B[33m[V² = Vi²+2*a*ΔS]\u001B[0m");
		System.out.println("[7] LVC \u001B[33m[H = Hi+(Vi*T)-(g*T²/2)] | [V = Vi-g*T] | [V² = Vi²+2*g*ΔH]\u001B[0m");
		System.out.println("[8] Q \u001B[33m[H = Hi-(Vi*T)-(g*T²/2)] | [V = -Vi-g*T] | [V² = -Vi²-2*g*ΔH]\u001B[0m");
		System.out.println("[9] QL \u001B[33m[H = Hi-(0*T)-(g*T²/2)] | [V = 0-g*T] | [V² = 0-2*g*ΔH]\u001B[0m");
		System.out.println("[10] Velocidade angular \u001B[33m[W = Δθ/ΔT] | [W = 2π/t]\u001B[0m");
		System.out.println("[11] Velocidade escalar \u001B[33m[V = 2π*R/t]\u001B[0m");
		System.out.println("[12] Peso de um corpo \u001B[33m[P = m*a]\u001B[0m");
		System.out.println("[13] Escala Termica \u001B[33m[Tc/5 = Tf-32/9] | [Tc = Tk-273] | [Tf-32/9 = Tk-273/5]\u001B[0m");
		System.out.print("\u001B[36mEscolha: \u001B[0m");
            int opcao=sc.nextInt();
         
		switch (opcao) {
            case 1:
                ps.VelocidadeMedia();
            break;
                case 2:
                    ps.MovimentoUniforme();
                break;
            case 3:
               ps.AceleracaoMedia();
            break;
                case 4:
                    ps.FunçãoHorariaDaVelocidade();
                break;
            case 5:
                ps.FunçãoHorariaDasPosições();
            break;
                case 6:
                    ps.EquaçãoDeTorricelli();
                break;
            case 7:
                ps.LVC();
            break;
                case 8:
                  ps.Q();  
                break;
            case 9:
                ps.Ql();
            break;
                case 10:
                    ps.VelocidadeAngular();
                break;
            case 11:
                ps.VelocidadeEscalar();
            break;
                case 12:
                    ps.Pesos();
                break;
            case 13:
                ps.EscalaTermica();
            break;
				case 14:
                    ps.DilatacaoLinear();
                break;
            case 15:
                ps.DilatacaoSuperficial();
            break;
                case 16:
                    ps.DilatacaoVolumetrica();
                break;
            case 17:
                ps.DilatacaoDosLiquidos();
            break;
                default:
                    System.out.println("Erro. Digite um número válido");
                break;
		}
		
	}
}
                default:
                    System.out.println("Erro. Digite um número válido");
                break;
		}
		
	}
}
