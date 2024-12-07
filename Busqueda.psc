Algoritmo Busqueda
	
	Dimension vec(6)
	
	Escribir "Ingerese numeros del arreglo"
	Para i<-1 Hasta 6
		Escribir "";
		Escribir "Igrese Numero ", i, ":"
		Leer vec(i)		
	FinPara
	
	Escribir "";
	Escribir "digite el numero a buscar"
	Leer num
	
	inf<-1
	sup<-6
	Repetir
		centro<-trunc((inf+sup)/2);
		si vec(centro)<num Entonces
			inf<-centro+1;
		FinSi
		Si vec(cntro)>num Entonces
			sup<-centro-1;
		FinSi
		
	Hasta Que inf>=sup  | vec(centro)=num
	Si vec(centro)=num Entonces
		Escribir "El numero: " num, "Se encuentra en la posicion: ", centro;
	SiNo
		Escribir "El numero:" num, "no esta en el vector"
		
	FinSi
FinAlgoritmo
