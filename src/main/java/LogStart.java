import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;
import java.text.ParseException;

/**
 * Created by Megaprey on 24.06.2017.
 */
public class LogStart {
    public static void main(String[] args) throws IOException, ParseException {
        ANTLRFileStream input = new ANTLRFileStream("Logg.txt");
        // Настраиваем лексер на этот поток
        LogLexer lexer = new LogLexer(input);
        // Создаем поток токенов на основе лексера
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        // Создаем парсер
        LogParser parser = new LogParser(tokens);
        // И запускаем первое правило грамматики!!!
        parser.log();
        PrintClient.print(Top10.sortTop10());

    }
}
