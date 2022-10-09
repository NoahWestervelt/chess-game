// Class file for Rook chess pieces.
import java.io.*;
import javax.imageio.*;
import java.awt.image.*;

public class Rook extends PieceAbstract
{
    private boolean notMoved = true;

    public Rook()
    {
        super();
    }
    public Rook(int x, int y, char player)
        throws NoSuchPlayerException
    {
        super(x, y, player);
    }
    public BufferedImage getImage()
        throws IOException
    {
        BufferedImage image;
        image = ImageIO.read(new File("images/"+player+"Rook.png"));
        return image;
    }
    public void move(int x, int y, PieceAbstract[] pieces)
        throws InvalidMoveException
    {
        rookMove(x, y, pieces);
        notMoved = false;
    }
    public boolean getNotMoved()
    {
        return notMoved;
    }
    public void setNotMoved(boolean notMoved)
    {
        this.notMoved = notMoved;
    }
}