package ex4;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

/** CLasse permettant de formatter une date
 *
 */
public class DateUtils {

	/** Méthode permattant d'appliquer une format de date personnalisé ou un format part défaut si aucun patterne n'a été envoyer.
	 *
	 * @param pattern
	 * @param date
	 * @return
	 */
	public static String format(String pattern, Date date) {
		
		SimpleDateFormat formateur = new SimpleDateFormat((Objects.equals(pattern, "")) ? "dd/MM/yyyy HH:mm:ss" : pattern);
		return formateur.format(date);
	}
}
