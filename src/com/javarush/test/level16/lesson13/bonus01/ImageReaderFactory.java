package com.javarush.test.level16.lesson13.bonus01;

import com.javarush.test.level16.lesson13.bonus01.common.*;

/**
 * Created by SS on 21.05.2016.
 */
public class ImageReaderFactory
{
    public static ImageReader getReader (ImageTypes e)
    {
        ImageReader reader;
        if (e == ImageTypes.BMP)
            reader = new BmpReader();
        else if (e == ImageTypes.JPG)
            reader = new JpgReader();
        else if (e == ImageTypes.PNG)
            reader = new PngReader();
        else
        {
            throw  new  IllegalArgumentException("Неизвестный тип картинки");
        }

        return reader;
    }
}
