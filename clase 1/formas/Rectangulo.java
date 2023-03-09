import java.awt.*;

/**
 * Un Rectangulo que puede ser manipulado y que se dibuja a si mismo en un canvas.
 * 
 * @author  Michael Kolling and David J. Barnes
 * @version 2006.03.30
 * Traducción Carlos A. Bartó
 */

public class Rectangulo
{
    private int tamano;
    private int tamano1;
    private int xPosicion;
    private int yPosicion;
    private String color;
    private boolean esVisible;

    /**
     * Crear un nuevo cuadrado con la posición y el color por defecto 
     */
    public Rectangulo()
    {
        tamano = 80;
        tamano1 = 50;
        xPosicion = 60;
        yPosicion = 50;
        color = "green";
        esVisible = false;
    }

    /**
     * Hacer visible éste cuadrado. Si ya estaba visible, no hacer nada.
     */
    public void hacerVisible()
    {
        esVisible = true;
        dibujar();
    }
    
    /**
     * Hacer invisible éste Rectangulo. Si ya estaba invisible, no hacer nada.
     */
    public void hacerInvisible()
    {
        borrar();
        esVisible = false;
    }
    
    /**
     * Mover el Rectangulo unos pocos pixeles a la derecha.
     */
    public void moverDerecha()
    {
        moverHorizontal(20);
    }

    /**
     * Mover el cuadrado unos pocos pixeles a la izquierda.
     */
    public void moverIzquierda()
    {
        moverHorizontal(-20);
    }

    /**
     * Mover el Rectangulo unos pocos pixeles hacia arriba.
     */
    public void moverArriba()
    {
        moverVertical(-20);
    }

    /**
     * Mover el Rectangulo unos pocos pixeles hacia abajo.
     */
    public void moverAbajo()
    {
        moverVertical(20);
    }

    /**
     * Mover el Rectangulo horizontalmente por una 'distancia' en pixeles.
     */
    public void moverHorizontal(int distancia)
    {
        borrar();
        xPosicion += distancia;
        dibujar();
    }

    /**
     * Mover el Rectangulo verticalmente por una 'distancia' en pixeles.
     */
    public void moverVertical(int distancia)
    {
        borrar();
        yPosicion += distancia;
        dibujar();
    }

    /**
     * Mover lenta y horizontalmente el Rectangulo por una 'distancia' en pixeles.
     */
    public void moverLentoHorizontal(int distancia)
    {
        int delta;

        if(distancia < 0) 
        {
            delta = -1;
            distancia = -distancia;
        }
        else 
        {
            delta = 1;
        }

        for(int i = 0; i < distancia; i++)
        {
            xPosicion += delta;
            dibujar();
        }
    }

    /**
     * Mover lenta y verticalmente el Rectangulo por una 'distancia' en pixeles.
     */
    public void moverLentoVertical(int distancia)
    {
        int delta;

        if(distancia < 0) 
        {
            delta = -1;
            distancia = -distancia;
        }
        else 
        {
            delta = 1;
        }

        for(int i = 0; i < distancia; i++)
        {
            yPosicion += delta;
            dibujar();
        }
    }

    /**
     * Cambiar el tamaño a un nuevo tamaño (en pixeles). Tamaño debe ser >= 0.
     */
    public void cambiarTamano(int base, int altura)
    {
        borrar();
        tamano = base;
        tamano1=altura;
        dibujar();
    }

    /**
     * Cambiar el color. Colores Válidos son: "red", "yellow", "blue", "green",
     * "magenta" y "black".
     */
    public void cambiarColor(String nuevoColor)
    {
        color = nuevoColor;
        dibujar();
    }

    /**
     * Dibujar el Cuadrado en la pantalla con las actuales especificaciones.
     */
    private void dibujar()
    {
        if(esVisible) {
            Canvas canvas = Canvas.getCanvas();
            canvas.dibujar(this, color,
                        new Rectangle(xPosicion, yPosicion, tamano, tamano1));
            canvas.esperar(10);
        }
    }

    /**
     * Borrar el Rectangulo en la pantalla.
     */
    private void borrar()
    {
        if(esVisible) {
            Canvas canvas = Canvas.getCanvas();
            canvas.borrar(this);
        }
    }
}
