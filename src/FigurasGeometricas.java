import java.util.Scanner;

public class FigurasGeometricas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenú de opciones:");
            System.out.println("1. Círculo");
            System.out.println("2. Cuadrado");
            System.out.println("3. Triángulo");
            System.out.println("4. Rectángulo");
            System.out.println("5. Pentágono");
            System.out.println("6. Salir");
            System.out.print("hola ");
            System.out.print("Seleccione una figura geométrica o presione 6 para salir: ");
            int opcionFigura = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea

            if (opcionFigura == 6) {
                System.out.println("Saliendo del programa.");
                break;
            }

            System.out.println("\nSeleccione la operación:");
            System.out.println("1. Calcular área");
            System.out.println("2. Calcular perímetro");
            System.out.print("Seleccione una operación: ");
            int opcionOperacion = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea

            double area = 0;
            double perimetro = 0;

            switch (opcionFigura) {
                case 1: // Círculo
                    System.out.print("Ingrese el radio del círculo: ");
                    double radioCirculo = scanner.nextDouble();
                    area = Circulo.calcularArea(radioCirculo);
                    perimetro = Circulo.calcularPerimetro(radioCirculo);
                    break;
                case 2: // Cuadrado
                    System.out.print("Ingrese el lado del cuadrado: ");
                    double ladoCuadrado = scanner.nextDouble();
                    area = Cuadrado.calcularArea(ladoCuadrado);
                    perimetro = Cuadrado.calcularPerimetro(ladoCuadrado);
                    break;
                case 3: // Triángulo
                    System.out.print("Ingrese la base del triángulo: ");
                    double baseTriangulo = scanner.nextDouble();
                    System.out.print("Ingrese la altura del triángulo: ");
                    double alturaTriangulo = scanner.nextDouble();
                    area = Triangulo.calcularArea(baseTriangulo, alturaTriangulo);
                    perimetro = Triangulo.calcularPerimetro(baseTriangulo, alturaTriangulo);
                    break;
                case 4: // Rectángulo
                    System.out.print("Ingrese la base del rectángulo: ");
                    double baseRectangulo = scanner.nextDouble();
                    System.out.print("Ingrese la altura del rectángulo: ");
                    double alturaRectangulo = scanner.nextDouble();
                    area = Rectangulo.calcularArea(baseRectangulo, alturaRectangulo);
                    perimetro = Rectangulo.calcularPerimetro(baseRectangulo, alturaRectangulo);
                    break;
                case 5: // Pentágono
                    System.out.print("Ingrese el lado del pentágono: ");
                    double ladoPentagono = scanner.nextDouble();
                    area = Pentagono.calcularArea(ladoPentagono);
                    perimetro = Pentagono.calcularPerimetro(ladoPentagono);
                    break;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
                    continue; // Saltar al siguiente ciclo del bucle while
            }

            switch (opcionOperacion) {
                case 1:
                    System.out.println("El área es: " + area);
                    break;
                case 2:
                    System.out.println("El perímetro es: " + perimetro);
                    break;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
            }
        }

        scanner.close();
    }
}

class Circulo {
    public static double calcularArea(double radio) {
        return Math.PI * radio * radio;
    }

    public static double calcularPerimetro(double radio) {
        return 2 * Math.PI * radio;
    }
}

class Cuadrado {
    public static double calcularArea(double lado) {
        return lado * lado;
    }

    public static double calcularPerimetro(double lado) {
        return 4 * lado;
    }
}

class Triangulo {
    public static double calcularArea(double base, double altura) {
        return (base * altura) / 2;
    }

    public static double calcularPerimetro(double base, double altura) {
        // No se puede calcular el perímetro con solo la base y la altura
        return -1;
    }
}

class Rectangulo {
    public static double calcularArea(double base, double altura) {
        return base * altura;
    }

    public static double calcularPerimetro(double base, double altura) {
        return 2 * (base + altura);
    }
}

class Pentagono {
    public static double calcularArea(double lado) {
        return (5.0 / 4.0) * Math.pow(lado, 2) / Math.tan(Math.PI / 5);
    }

    public static double calcularPerimetro(double lado) {
        return 5 * lado;
    }
}
