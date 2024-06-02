/*
 * MyBatisを使ってみる
 */
package ittimfn.usemybatis;

import java.util.List;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import ittimfn.usemybatis.enums.PropertiesEnum;
import ittimfn.usemybatis.service.SampleService;

public class App {

    private static final Logger logger = LogManager.getLogger(App.class);

    private static final String PROPERTIES_FILEPATH = Paths.get("application.properties").toString();

    public void exec(String[] args) {
        SampleService service = new SampleService();
        service.selectById(1);
        service.selectAll();
        service.selectInId(List.of(1, 3));
    }

    public void load() throws Exception {
        Path propertiesPath = 
            Paths.get(
                Thread.currentThread()
                    .getContextClassLoader()
                    .getResource(PROPERTIES_FILEPATH) // resources下のファイルパスを指定する。
                    .getPath()
        );
        PropertiesEnum.load(propertiesPath);
    }

    public static void main(String[] args) {
        logger.info("Use MyBatis Start.");
        App app = new App();
        try {
            app.load();
            app.exec(args);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        }
        logger.info("Use MyBatis Finish.");
    }
}
