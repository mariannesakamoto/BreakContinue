public class BreakContinue {
    public static void main(String[] args) {
        int count = 0;
        
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) { // Se o número for par
                continue; // Pula para a próxima iteração do loop
            }
            
            System.out.println("O numero e " + i);
            count++;
            
            if (count == 7) {
                break; // Sai do loop quando o contador de loops atingir 7
            }
        }
    }
}