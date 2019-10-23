
public class Operaciones {
	
public void Suma(int num1,int num2) {
//	int num1=3;
//	int num2=5;
System.out.println("El resultado de la suma es:" + ( num1+num2));
}
public void Resta(int num1,int num2) {
	System.out.println("El resultado de la resta es:" + ( num1-num2));
	
}
public void Producto(int num1,int num2) {
	System.out.println("El resultado de la multiplicación es:" + ( num1*num2));
}
public void Division(int num1,int num2) {
	if (num2==0) {
		System.out.println("No se puede realizar la division");
	}else
		System.out.println("El resultado de la división es:" + ( num1/num2));
}

public void MostrarNum (int num1,int num2) {
	
//	
//		for(int i=1; i<=100; i++) {
//		System.out.print(i+" ");
	if (num1>num2) {
	for(int i = num1+1;  i < num2; i++ )
	
	{
		
	    System.out.println(i);
	   
	} System.out.println("El primer numero ingresado es mayor que el segundo");}
	
}
	
	
}
	

