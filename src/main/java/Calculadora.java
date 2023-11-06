
		public class Calculadora {
		    public int subtraiInt(int a, int b) {
		        return a - b;
		    }

		    public int multiplicaInt(int a, int b) {
		        return a * b;
		    }

		    public double divideInt(int a, int b) {
		        if (b == 0) {
		            throw new ArithmeticException("Divisão por zero não é válida");
		        }
		        return (double) a / b;
		    }

		    public static void main(String[] args) {
		        Calculadora calculadora = new Calculadora();
		        int resultadoSub = calculadora.subtraiInt(10, 5);
		        int resultadoMulti = calculadora.multiplicaInt(3, 4);
		        double resultadoDiv = calculadora.divideInt(8, 2);

		        System.out.println("Resultado Subtração: " + resultadoSub);
		        System.out.println("Resultado Multiplicação: " + resultadoMulti);
		        System.out.println("Resultado Divisão: " + resultadoDiv);
		    }



	}

