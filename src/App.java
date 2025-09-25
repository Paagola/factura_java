public class App {

    public static void main(String[] args) throws Exception {

    System.out.println("Rojo Polo Paella Inc.\nCarretera Muelle 38\n37531 Ávila, Ávila\n");
    System.out.printf("╔%s%-20s%s╦ %s%-20s%s╦ %s%-20s%s╦%s%20s%s  ╗ %n",
      ut.BLUE, "FACTURAR A",   ut.RESET,
    ut.BLUE, "ENVIAR A",     ut.RESET,
    ut.BLUE, "Nº DE FACTURA",ut.RESET,
     ut.BLUE, "ES-001", ut.RESET);
    System.out.println("╠════════════════════╬═════════════════════╬═════════════════════╬══════════════════════╣");
    System.out.printf("║%-20s║ %-20s║ %-20s║ %20s ║ %n", "Leda Villaneal", "Leda Villareal", "FECHA", "29.01.2019");
    System.out.println("╠════════════════════╬═════════════════════╬═════════════════════╬══════════════════════╣");
    System.out.printf("║%-20s║ %-20s║ %-20s║ %20s ║ %n", "Virgen Blanca 63", "Cercas Bajas 68", "Nº DE PEDIDO", "17/30/2019");
    System.out.println("╠════════════════════╬═════════════════════╬═════════════════════╬══════════════════════╣");
    System.out.printf("║%-20s║ %-20s║ %-20s║ %20s ║ %n", "08342 Burgos, Burgos", "547834 Cádiz, Cádiz", "FECHA", "29.01.2019");
    System.out.println("╚════════════════════╩═════════════════════╬═════════════════════╬══════════════════════╣");
    System.out.printf("%-20s  %-20s ║ %-20s║ %20s ║ %n", "", "", "VENCIMIENTO", "29.01.2019");
    System.out.printf("%89s%n%n", "╚═════════════════════╩══════════════════════╝");
    System.out.println("───────────────────────────────────────────────────────────────────────────────────────");
    System.out.printf(ut.BOLD + "%-43s %43s %n" + ut.RESET, "T O T A L  F A C T U R A", "1 9 9 . 6 5 $");
    System.out.println("───────────────────────────────────────────────────────────────────────────────────────\n");
    System.out.printf("╔%s %-8s%s╦%s %-40s%s╦%s %20s%s╦%s %10s %s╗%n",
     ut.BG_GREEN, "CANT.", ut.RESET,
      ut.BG_GREEN, "DESCRIPCIÓN",ut.RESET,
      ut.BG_GREEN,"PRECIO UNITARIO ",ut.RESET,
      ut.BG_GREEN,  "IMPORTE" ,ut.RESET);
    System.out.println("╠═════════╬═════════════════════════════════════════╬═════════════════════╬════════════╣");
    System.out.printf("║ %-8s║ %-40s║ %20s║ %10s ║ %n", "1", "Talla pequeña traje de luces en rojo", "100.00 ", "100.00");
    System.out.println("╠═════════╬═════════════════════════════════════════╬═════════════════════╬════════════╣");
    System.out.printf("║ %-8s║ %-40s║ %20s║ %10s ║ %n", "2", "Mui grande churrolito", "25.00 ", "50.00");
    System.out.println("╠═════════╬═════════════════════════════════════════╬═════════════════════╬════════════╣");
    System.out.printf("║ %-8s║ %-40s║ %20s║ %10s ║ %n", "3", "Equipaje de futbol", "5.00 ", "15.00");
    System.out.println("╚═════════╩═════════════════════════════════════════╬═════════════════════╬════════════╣");
    System.out.printf("%-10s  %-40s║ %20s║ %10s ║ %n", "", "", "Subtotal ", "165.00");
    System.out.printf("%88s%n", "╠═════════════════════╬════════════╣");
    System.out.printf("%-10s  %-40s║ %20s║ %10s ║ %n", "", "", "IVA 21.0% ", "34,65");
    System.out.printf("%88s%n%n", "╚═════════════════════╩════════════╝");
}   
}