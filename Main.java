public class Main {

	public static void Main(String[] args) {
		// TODO Auto-generated method stub

final String nombredeEmpresa = "Distribuidora TupperWare";
		
		double costoUnitario = 30; // Q45.00
		int cantidadDeProductos = 400;
		double totalAPagar = costoUnitario*cantidadDeProductos; // Q
		final double precioDeVenta = 60;
		final double IVA = 0.12; // 12%
		double totalIVAPorUnidad =precioDeVenta*IVA;
		
		System.out.println("Costo por unidad: Q"+costoUnitario);
		System.out.println("Cantidad de producto: "+cantidadDeProductos);
		System.out.println("-------------------------");
		System.out.println("Total: Q"+totalAPagar);
		
		System.out.println("Venderse a: Q"+precioDeVenta);
		System.out.println("Impuesto establecido: "+IVA);
		System.out.println("Impuesto por unidad comprada: Q"+totalIVAPorUnidad);
		
		
		int cantidadProductosVendidos = 40;
		double totalCobradoSinDescuento =  cantidadProductosVendidos*precioDeVenta;
		
		double tipoDeDescuento = 0;
		double totalConDescuento = 0;
		if(cantidadProductosVendidos>=50) {
		 tipoDeDescuento = 0.05;
		 totalConDescuento = totalCobradoSinDescuento -(totalCobradoSinDescuento*tipoDeDescuento);
		}
		
		if(cantidadProductosVendidos>=100) {
		 tipoDeDescuento = 0.15;
		 totalConDescuento = totalCobradoSinDescuento -(totalCobradoSinDescuento*tipoDeDescuento);
		}
		
		if(cantidadProductosVendidos>=1000) {
		 tipoDeDescuento = 0.25;	
		 totalConDescuento = totalCobradoSinDescuento -(totalCobradoSinDescuento*tipoDeDescuento);
		}
		
		
		double impuestoTotalADeclarar = totalConDescuento * IVA;
		
		double ganancias = (totalCobradoSinDescuento - (cantidadProductosVendidos*costoUnitario))-impuestoTotalADeclarar;
			
		System.out.println("");
		System.out.println("-------------------------");
		System.out.println("Cantidad vendida: "+ cantidadProductosVendidos);
		System.out.println("Total sin descuento: " +totalCobradoSinDescuento);
		System.out.println("Total con descuento: "+ totalConDescuento);
		System.out.println("IVA a declarar: Q"+ impuestoTotalADeclarar);
		System.out.println("Tipo de descuento: "+ tipoDeDescuento);
		System.out.println("Ganancia: Q"+ganancias);
	}

}

