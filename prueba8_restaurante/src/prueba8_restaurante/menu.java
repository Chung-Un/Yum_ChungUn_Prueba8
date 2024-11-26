/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba8_restaurante;

/**
 *
 * @author chung
 */


public class menu extends cliente {

    public String[][] getMenuLunes() {
        return menuLunes;
    }

    public void setMenuLunes(String[][] menuLunes) {
        this.menuLunes = menuLunes;
    }

    public String[][] getMenuMartes() {
        return menuMartes;
    }

    public void setMenuMartes(String[][] menuMartes) {
        this.menuMartes = menuMartes;
    }

    public String[][] getMenuMiercoles() {
        return menuMiercoles;
    }

    public void setMenuMiercoles(String[][] menuMiercoles) {
        this.menuMiercoles = menuMiercoles;
    }

    public String[][] getMenuJueves() {
        return menuJueves;
    }

    public void setMenuJueves(String[][] menuJueves) {
        this.menuJueves = menuJueves;
    }

    public String[][] getMenuViernes() {
        return menuViernes;
    }

    public void setMenuViernes(String[][] menuViernes) {
        this.menuViernes = menuViernes;
    }

    public String[][] getMenuSabado() {
        return menuSabado;
    }

    public void setMenuSabado(String[][] menuSabado) {
        this.menuSabado = menuSabado;
    }

    public String[][] getMenuDomingo() {
        return menuDomingo;
    }

    public void setMenuDomingo(String[][] menuDomingo) {
        this.menuDomingo = menuDomingo;
    }
    
    String[][] menuLunes = {{"Arroz frito", "Pollo teriyaki","Carne asada"},{"Lps.90","Lps.130","Lps.200"},{"Arroz extra", "Salsa extra"},{"Lps.50","Lps.20"}};
    String[][] menuMartes = {{"Huevos rancheros", "Pollo bbq","Chicken fingers"},{"Lps.60","Lps.150","Lps.200"},{"Papas","Serving de queso"},{"Lps.60","Lps.45"}};
    String[][] menuMiercoles = {{"Tostadas", "Hamburguesa de pollo","Ensalada oriental"},{"Lps.70","Lps.150","Lps.220"},{"Pan tostado","Repollo"},{"Lps.20","Lps.60"}};
    String[][] menuJueves = {{"Desayuno tipico", "Pinchos","Sopa de mariscos"},{"Lps.90","Lps.145","Lps.250"},{"Ensalda extra","Salsa extra"},{"Lps.80","Lps.20"}};
    String[][] menuViernes = {{"Arroz frito", "Hamburguesa de pollo","Chicken fingers"},{"Lps.90","Lps.150","Lps.200"},{"Serving de queso","Papas extra"},{"Lps.60","Lps.75"}};
    String[][] menuSabado = {{"Tostadas", "Pollo BBQ","Ensalada oriental"},{"Lps.70","Lps.150","Lps.220"},{"Miel maple","Queso extra"},{"Lps.80","Lps.50"}};
    String[][] menuDomingo = {{"Huevos rancheros", "Pollo teriyaki","Sopa de mariscos"},{"Lps.60","Lps.130","Lps.250"},{"Huevos hervidos","Maiz"},{"Lps.50","Lps.40"}};
    
}

