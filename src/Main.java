import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
//		System.out.println("A continuacion debe ingresar 2 n�meros: ");
System.out.println("Bienvenido al modulo de operaciones \n Ingrese un n�mero para elegir una operaci�n \n1. Suma \n2. Resta \n3. Divisi�n \n4.Mostrar N�meros");
int num3=sc.nextInt();

System.out.println("Ingrese el primer n�mero: ");
		int num1=sc.nextInt();
System.out.println("Ingrese el segundo n�mero: ");
		int num2=sc.nextInt();
		
//		int num1=3;
//		int num2=5;
		//sysout y luego presiono ctrl + la tecla espacio
		//Para comentar el c�digo se selecciona y se preciona control +7
//		System.out.println("El resultado de la suma es:" + ( num1+num2));
//		System.out.println("El resultado de la resta es:" + ( num1-num2));
//		System.out.println("El resultado de la multiplicaci�n es:" + ( num1*num2));
//		System.out.println("El resultado de la divisi�n es:" + ( num1/num2));
//		
		
//		if(num1>num2)
//		{
//			System.out.println("El numero "+ num1+" es mayor que "+num2);
//		} if (num1==num2){
//			System.out.println("Los n�meros son iguales"+num1+ " y "+ num2);
//		}
//		if(num1<num2) 
//			System.out.println(num2+" Es mayor que "+num1);
		
		
//for(int i=1; i<=100; i++) {
//	
//	System.out.print(i+" ");
//}
		Operaciones op= new Operaciones();
		
		if (num3==1) {
		op.Suma(num1,num2);}
		else {
			if(num3==2) {
				op.Division(num1, num2);
			}else {
				if(num3==3) {
					op.Resta(num1, num2);
				}else {
					if(num3==4) {
						op.Producto(num1, num2);
					}else {
						if (num3==5) {
							op.MostrarNum(num1, num2);
						}else {
							System.out.println("El n�emro no existe");
						}
					}
				}
			}
		}
		
	
	}
		
		
		
		
}
		



