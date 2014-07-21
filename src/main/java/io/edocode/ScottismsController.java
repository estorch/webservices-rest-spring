package main.java.io.edocode;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @author      Eric Storch <eric@edocode.io>
 * @version     0.1
 * @since       2014-06-02
 */
@Controller
public class ScottismsController {

  /** Counter */
  private final AtomicLong counter = new AtomicLong();
  /** Scottisms string array */
  private final String[] scottisms = {
      "Brah brah brah brah, brah.",
      "Ain't no one got time for that!",
      "God Eric, you're so BORING.",
      "(facepalm)",
      "So Friday, such relax. Wow.",
      "You can't spell 'fun' without FU.",
      "Bro, do you even Prometheus?",
      "How 'bout them Aliens?",
      "...",
      "Kitty.",
      "KITTEH!",
      "Bro.",
      "(y)",
      "Better you than me.",
      "idgaf",
      "Those Canadians, they took our jerbs.",
      "That escalated quickly.",
      "░░░░░░░░░▄░░░░░░░░░░░░░░▄\n" +
      "░░░░░░░░▌▒█░░░░░░░░░░░▄▀▒▌\n" +
      "░wow░░░░▌▒▒█░░░░░░░░▄▀▒▒▒▐\n" +
      "░░░░░░░▐▄▀▒▒▀▀▀▀▄▄▄▀▒▒▒▒▒▐\n" +
      "░░░░░▄▄▀▒░▒▒▒▒▒▒▒▒▒█▒▒▄█▒▐\n" +
      "░░░▄▀▒▒▒░░░▒▒▒░░░▒▒▒▀██▀▒▌\n" +
      "░░▐▒▒▒▄▄▒▒▒▒░░░▒▒▒▒▒▒▒▀▄▒▒▌\n" +
      "░░▌░░▌█▀▒▒▒▒▒▄▀█▄▒▒▒▒▒▒▒█▒▐\n" +
      "░▐░░░▒▒▒▒▒▒▒▒▌██▀▒▒░░░▒▒▒▀▄▌\n" +
      "░▌░▒▄██▄▒▒▒▒▒▒▒▒▒░░░░░░▒▒▒▒▌\n" +
      "▀▒▀▐▄█▄█▌▄░▀▒▒░░░░░░░░░░▒▒▒▐ much burn\n" +
      "▐▒▒▐▀▐▀▒░▄▄▒▄▒▒▒▒▒▒░▒░▒░▒▒▒▒▌\n" +
      "▐▒▒▒▀▀▄▄▒▒▒▄▒▒▒▒▒▒▒▒░▒░▒░▒▒▐\n" +
      "░▌▒▒▒▒▒▒▀▀▀▒▒▒▒▒▒░▒░▒░▒░▒▒▒▌\n" +
      "░▐▒▒▒▒▒▒▒▒▒▒▒▒▒▒░▒░▒░▒▒▄▒▒▐\n" +
      "░░▀▄▒▒▒▒▒▒▒▒▒▒▒░▒░▒░▒▄▒▒▒▒▌\n" +
      "░░░░▀▄▒▒▒▒▒▒▒▒▒▒▄▄▄▀▒▒▒▒▄▀\n" +
      "          such sarcasm      ",
      "That's it, man. Game over, man! Game over!",
      "I say we take off and nuke the entire site from orbit. It's the only way to be sure.",
      "Symfony, y u do dis? Symfony plz.",
      "Ermahgerd.",
      "U mad, bro?",
      "Hey, I've got a question. ... U mad?",
      "Oh, there was something I was going to ask you. What was it again? ... Oh, yeah. U mad?",
      "I got a tattoo down there that says \"Asians Only.\" I wanted to be trendy, so I had it written in Chinese. Ironically, now it's useless, since if you can read it, the warning doesn't apply."
  };

  /**
   * Controller for /scottisms service
   * @return
   */
  @RequestMapping("/scottisms")
  public @ResponseBody
  Scottisms scottisms() {
    /** Random number generator */
    int randomNum = (int)(Math.random() * scottisms.length);

    /** Return a random Scottism */
    return new Scottisms(counter.incrementAndGet(), scottisms[randomNum]);
  }
}