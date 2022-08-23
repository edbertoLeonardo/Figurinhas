import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.Font;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class GerarFigurinha {

    public void criar() throws IOException {

        //ler imagem
        BufferedImage imagemOriginal = ImageIO.read(new File("fotos/zoo.png"));

        // cria nova imagem em memória com transparencia e tamnho novo
        int largura = imagemOriginal.getWidth();
        int altura = imagemOriginal.getHeight();
        //int novaAltura = altura + 400;
        int novaAltura = altura + 1000;
        BufferedImage novaImagem = new BufferedImage(largura, novaAltura, BufferedImage.TRANSLUCENT);

        //copiar a imagem original pra nva imagem (em memoria)
        Graphics2D graphics = (Graphics2D) novaImagem.getGraphics();
        graphics.drawImage(imagemOriginal, 0, 0, null);

        //fonte
        //Font tamanho = new Font(Font.SANS_SERIF, Font.BOLD, 300);
        Font tamanho = new Font("Impact", Font.PLAIN, 300);
        graphics.setColor(Color.YELLOW);
        graphics.setFont(tamanho);

        //escrever frase
        graphics.drawString("JOINHA", 170, novaAltura - 200);

        

        //escrever a nova imagem em arquivo
        ImageIO.write(novaImagem, "png", new File("saida/figurinha7.png"));
    }

    public static void main(String[] args) throws IOException {
        GerarFigurinha gerarFigurinha = new GerarFigurinha();
        gerarFigurinha.criar();
    }
}
