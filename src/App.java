public class App {
    public static void main(String[] args) throws Exception {

    

    System.out.println("Rojo Polo Paella Inc.\nCarretera Muelle 38\n37531 Ávila, Ávila\n");
    System.out.printf(ut.BLUE +"╔%-20s╦ %-20s╦ %-20s╦ %20s ╗ %n" + ut.RESET, "FACTURAR A", "ENVIAR A", "Nº DE FACTURA", "ES-001");
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
    System.out.printf(ut.BG_CYAN + "%-43s %43s %n", "TOTAL FACTURA", 199.65+"$" + ut.RESET);
    System.out.println("───────────────────────────────────────────────────────────────────────────────────────\n");
    System.out.printf(ut.BG_RED + "%-10s▒ %-40s▒ %20s▒ %10s ▒" + ut.RESET + "%n", "CANT.", "DESCRIPCIÓN", "PRECIO UNITARIO ", "IMPORTE");
    System.out.println("═══════════════════════════════════════════════════════════════════════════════════════");
    System.out.printf("%-10s║ %-40s║ %20s║ %10s ║ %n", "1", "Talla pequeña traje de luces en rojo", "100.00 ", "100.00");
    System.out.println("───────────────────────────────────────────────────────────────────────────────────────");
    System.out.printf("%-10s║ %-40s║ %20s║ %10s ║ %n", "2", "Mui grande churrolito", "25.00 ", "50.00");
    System.out.println("───────────────────────────────────────────────────────────────────────────────────────");
    System.out.printf("%-10s║ %-40s║ %20s║ %10s ║ %n", "3", "Equipaje de futbol", "5.00 ", "15.00");
    System.out.println("───────────────────────────────────────────────────────────────────────────────────────");
    System.out.printf("%-10s  %-40s║ %20s║ %10s ║ %n %n", "", "", "Subtotal ", "165.00");
    System.out.printf("%-10s  %-40s║ %20s║ %10s ║ %n %n", "", "", "IVA 21.0% ", "34,65");
}   
}