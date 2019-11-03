package translator.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import translator.Application;
import translator.domain.TranslatedText;

import static org.junit.Assert.assertEquals;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class TranslatorServiceTest {

  @Autowired
  TranslatorService translatorService;

  @Test
  public void translateTest_en_to_es() {
    TranslatedText translatedText = translatorService.translate("en", "es", "This is a test of translation service");
    assertEquals("Esto es una prueba de servicio de traducción", translatedText.getTranslation());
  }

  @Test
  public void translateTest_en_to_ca() {
    TranslatedText translatedText = translatorService.translate("en", "ca", "Hello i am student of university");
    assertEquals("Hola sóc estudiant de la universitat", translatedText.getTranslation());
  }

  @Test
  public void translateTest_en_to_gl() {
    TranslatedText translatedText = translatorService.translate("en", "gl", "My name is alex");
    assertEquals("O meu nome é alex", translatedText.getTranslation());
  }

}
