package com.mds.foro;

import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;

import com.vaadin.ui.Button;
import com.vaadin.ui.Notification;
import com.vaadin.ui.Button.ClickEvent;

@SuppressWarnings("serial")
public class Recuperar_password extends Recuperar_password_Ventana {

	// Declaraciones
	iUsuario_no_identificado usuarioNoIdentificado;

	// Inicializador
	public void inicializar() {
		usuarioNoIdentificado = new DB_Main();
	}

	// Constructor
	public Recuperar_password() {
		inicializar();

		// Botones del constructor
		nombreForo.addClickListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {
				addComponent(new Usuario_no_identificado());
			}
		});

		menuRegistrarse.addClickListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {
				addComponent(new Registrarse());
			}
		});

		menuIniciarSesion.addClickListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {
				addComponent(new Iniciar_sesion());
			}
		});

		botonAtras.addClickListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {
				addComponent(new Iniciar_sesion());
			}
		});

		botonEnviar.addClickListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {
				recuperarContrasenia();
			}
		});
	}

	// Metodo
	private void recuperarContrasenia() {
		if (labelEmail.getValue() == null || labelEmail.getValue() == "" || labelNombreUsuario.getValue() == null
				|| labelNombreUsuario.getValue() == "") {
			Notification.show("El nombre o el correo no pueden estar vacios", "", Notification.Type.ERROR_MESSAGE);
		} else if (usuarioNoIdentificado.recuperarContrasenia(labelNombreUsuario.getValue(), labelEmail.getValue())) {
			enviarPassword();
		} else {
			Notification.show("El nombre de usuario o el correo es incorrecto", "", Notification.Type.ERROR_MESSAGE);
		}
	}

	// Metodo enviarPassword
	public void enviarPassword() {
		try {
			HtmlEmail email = new HtmlEmail();
			email.setHostName("smtp.gmail.com");
			email.setSmtpPort(587);
			email.setSSLOnConnect(true);
			email.setAuthentication("foromds22020@gmail.com", "mds22020");
			email.setFrom("help@mds2foro.es");
			email.addTo(Parametros.getCorreoUsuario());
			email.setSubject("🔒 Recuperacion de contraseña | ForoMDS2");
			email.setHtmlMsg(
					"<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\"><html><head> <meta charset=\"UTF-8\"> <meta content=\"width=device-width, initial-scale=1\" name=\"viewport\"> <meta name=\"x-apple-disable-message-reformatting\"> <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\"> <meta content=\"telephone=no\" name=\"format-detection\"> <title></title> <!--[if (mso 16)]> <style type=\"text/css\"> a {text-decoration: none;} </style> <![endif]--> <!--[if gte mso 9]><style>sup { font-size: 100% !important; }</style><![endif]--> <!--[if !mso]><!-- --> <link href=\"https://fonts.googleapis.com/css?family=Lato:400,400i,700,700i\" rel=\"stylesheet\"><link href=\"\" rel=\"stylesheet\"><style>.ExternalClass{width:100%}.ExternalClass,.ExternalClass div,.ExternalClass font,.ExternalClass p,.ExternalClass span,.ExternalClass td{line-height:100%}.es-button{mso-style-priority:100!important;text-decoration:none!important}a[x-apple-data-detectors]{color:inherit!important;text-decoration:none!important;font-size:inherit!important;font-family:inherit!important;font-weight:inherit!important;line-height:inherit!important}.es-desk-hidden{display:none;float:left;overflow:hidden;width:0;max-height:0;line-height:0;mso-hide:all}s{text-decoration:line-through}body,html{width:100%;font-family:lato,'helvetica neue',helvetica,arial,sans-serif;-webkit-text-size-adjust:100%;-ms-text-size-adjust:100%}table{mso-table-lspace:0;mso-table-rspace:0;border-collapse:collapse;border-spacing:0}.es-wrapper,body,html,table td{padding:0;Margin:0}.es-content,.es-footer,.es-header{table-layout:fixed!important;width:100%}img{display:block;border:0;outline:0;text-decoration:none;-ms-interpolation-mode:bicubic}table tr{border-collapse:collapse}hr,p{Margin:0}h1,h2,h3,h4,h5{Margin:0;line-height:120%;mso-line-height-rule:exactly;font-family:lato,'helvetica neue',helvetica,arial,sans-serif}a,ol li,p,ul li{-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly}.es-left{float:left}.es-right{float:right}.es-p5{padding:5px}.es-p5t{padding-top:5px}.es-p5b{padding-bottom:5px}.es-p5l{padding-left:5px}.es-p5r{padding-right:5px}.es-p10{padding:10px}.es-p10t{padding-top:10px}.es-p10b{padding-bottom:10px}.es-p10l{padding-left:10px}.es-p10r{padding-right:10px}.es-p15{padding:15px}.es-p15t{padding-top:15px}.es-p15b{padding-bottom:15px}.es-p15l{padding-left:15px}.es-p15r{padding-right:15px}.es-p20{padding:20px}.es-p20t{padding-top:20px}.es-p20b{padding-bottom:20px}.es-p20l{padding-left:20px}.es-p20r{padding-right:20px}.es-p25{padding:25px}.es-p25t{padding-top:25px}.es-p25b{padding-bottom:25px}.es-p25l{padding-left:25px}.es-p25r{padding-right:25px}.es-p30{padding:30px}.es-p30t{padding-top:30px}.es-p30b{padding-bottom:30px}.es-p30l{padding-left:30px}.es-p30r{padding-right:30px}.es-p35{padding:35px}.es-p35t{padding-top:35px}.es-p35b{padding-bottom:35px}.es-p35l{padding-left:35px}.es-p35r{padding-right:35px}.es-p40{padding:40px}.es-p40t{padding-top:40px}.es-p40b{padding-bottom:40px}.es-p40l{padding-left:40px}.es-p40r{padding-right:40px}.es-menu td{border:0}.es-menu td a img{display:inline-block!important}a{font-family:lato,'helvetica neue',helvetica,arial,sans-serif;font-size:18px;text-decoration:underline}h1{font-size:48px;font-style:normal;font-weight:400;color:#111}h1 a{font-size:48px}h2{font-size:24px;font-style:normal;font-weight:400;color:#111}h2 a{font-size:24px}h3{font-size:20px;font-style:normal;font-weight:400;color:#111}h3 a{font-size:20px}ol li,p,ul li{font-size:18px;font-family:lato,'helvetica neue',helvetica,arial,sans-serif;line-height:150%}ol li,ul li{Margin-bottom:15px}.es-menu td a{text-decoration:none;display:block}.es-wrapper{width:100%;height:100%;background-repeat:repeat;background-position:center top}.es-wrapper-color{background-color:#f4f4f4}.es-content-body{background-color:#fff}.es-content-body ol li,.es-content-body p,.es-content-body ul li{color:#666}.es-content-body a{color:#7c72dc}.es-header{background-color:#7c72dc;background-repeat:repeat;background-position:center top}.es-header-body{background-color:#7c72dc}.es-header-body ol li,.es-header-body p,.es-header-body ul li{color:#666;font-size:14px}.es-header-body a{color:#111;font-size:14px}.es-footer{background-color:transparent;background-repeat:repeat;background-position:center top}.es-footer-body{background-color:transparent}.es-footer-body ol li,.es-footer-body p,.es-footer-body ul li{color:#666;font-size:14px}.es-footer-body a{color:#111;font-size:14px}.es-infoblock,.es-infoblock ol li,.es-infoblock p,.es-infoblock ul li{line-height:120%;font-size:12px;color:#ccc}.es-infoblock a{font-size:12px;color:#ccc}a.es-button{border-style:solid;border-color:#7c72dc;border-width:15px 25px 15px 25px;display:inline-block;background:#7c72dc;border-radius:2px;font-size:20px;font-family:helvetica,'helvetica neue',arial,verdana,sans-serif;font-weight:400;font-style:normal;line-height:120%;color:#fff;text-decoration:none;width:auto;text-align:center}.es-button-border{border-style:solid solid solid solid;border-color:#7c72dc #7c72dc #7c72dc #7c72dc;background:#7c72dc;border-width:1px 1px 1px 1px;display:inline-block;border-radius:2px;width:auto}.es-button img{display:inline-block;vertical-align:middle}@media only screen and (max-width:600px){a,ol li,p,ul li{font-size:16px!important;line-height:150%!important}h1{font-size:30px!important;text-align:center;line-height:120%!important}h2{font-size:26px!important;text-align:center;line-height:120%!important}h3{font-size:20px!important;text-align:center;line-height:120%!important}h1 a{font-size:30px!important}h2 a{font-size:26px!important}h3 a{font-size:20px!important}.es-menu td a{font-size:16px!important}.es-header-body a,.es-header-body ol li,.es-header-body p,.es-header-body ul li{font-size:16px!important}.es-footer-body a,.es-footer-body ol li,.es-footer-body p,.es-footer-body ul li{font-size:16px!important}.es-infoblock a,.es-infoblock ol li,.es-infoblock p,.es-infoblock ul li{font-size:12px!important}[class=gmail-fix]{display:none!important}.es-m-txt-c,.es-m-txt-c h1,.es-m-txt-c h2,.es-m-txt-c h3{text-align:center!important}.es-m-txt-r,.es-m-txt-r h1,.es-m-txt-r h2,.es-m-txt-r h3{text-align:right!important}.es-m-txt-l,.es-m-txt-l h1,.es-m-txt-l h2,.es-m-txt-l h3{text-align:left!important}.es-m-txt-c img,.es-m-txt-l img,.es-m-txt-r img{display:inline!important}.es-button-border{display:block!important}a.es-button{font-size:20px!important;display:block!important;border-width:15px 25px 15px 25px!important}.es-btn-fw{border-width:10px 0!important;text-align:center!important}.es-adaptive table,.es-btn-fw,.es-btn-fw-brdr,.es-left,.es-right{width:100%!important}.es-content,.es-content table,.es-footer,.es-footer table,.es-header,.es-header table{width:100%!important;max-width:600px!important}.es-adapt-td{display:block!important;width:100%!important}.adapt-img{width:100%!important;height:auto!important}.es-m-p0{padding:0!important}.es-m-p0r{padding-right:0!important}.es-m-p0l{padding-left:0!important}.es-m-p0t{padding-top:0!important}.es-m-p0b{padding-bottom:0!important}.es-m-p20b{padding-bottom:20px!important}.es-hidden,.es-mobile-hidden{display:none!important}.es-desk-hidden{display:table-row!important;width:auto!important;overflow:visible!important;float:none!important;max-height:inherit!important;line-height:inherit!important}.es-desk-menu-hidden{display:table-cell!important}.esd-block-html table,table.es-table-not-adapt{width:auto!important}table.es-social{display:inline-block!important}table.es-social td{display:inline-block!important}}.es-p-default{padding-top:20px;padding-right:30px;padding-bottom:0;padding-left:30px}.es-p-all-default{padding:0}</style> <!--<![endif]--></head><body> <div class=\"es-wrapper-color\"> <!--[if gte mso 9]><v:background xmlns:v=\"urn:schemas-microsoft-com:vml\" fill=\"t\"><v:fill type=\"tile\" color=\"null\"></v:fill></v:background><![endif]--> <table class=\"es-wrapper\" width=\"100%\" cellspacing=\"0\" cellpadding=\"0\"> <tbody> <tr class=\"gmail-fix\" height=\"0\"> <td> <table width=\"600\" cellspacing=\"0\" cellpadding=\"0\" border=\"0\" align=\"center\"> <tbody> <tr> <td cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"line-height: 1px; min-width: 600px;\" height=\"0\"><img src=\"https://esputnik.com/repository/applications/images/blank.gif\" style=\"display: block; max-height: 0px; min-height: 0px; min-width: 600px; width: 600px;\" alt width=\"600\" height=\"1\"></td> </tr> </tbody> </table> </td> </tr> <tr> <td class=\"esd-email-paddings\" valign=\"top\"> <table class=\"es-header esd-header-popover\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\"> <tbody> <tr> <td class=\"esd-stripe\" esd-custom-block-id=\"6339\" style=\"background-color: #1976d2;\" bgcolor=\"#1976d2\" align=\"center\"> <table class=\"es-header-body\" width=\"600\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\" bgcolor=\"#1976d2\" style=\"background-color: #1976d2;\"> <tbody> <tr> <td class=\"esd-structure es-p20t es-p10b es-p10r es-p10l\" align=\"left\"> <table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\"> <tbody> <tr> <td class=\"esd-container-frame\" width=\"580\" valign=\"top\" align=\"center\"> <table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\"> <tbody> <tr> <td class=\"esd-block-image es-p25t es-p25b es-p10r es-p10l\" align=\"center\" style=\"font-size: 0px;\"><a href target=\"_blank\"><img src=\"https://i.ibb.co/FsxW1sD/logo-copia.png\" alt style=\"display: block;\" width=\"40\"></a></td> </tr> </tbody> </table> </td> </tr> </tbody> </table> </td> </tr> </tbody> </table> </td> </tr> </tbody> </table> <table class=\"es-content\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\"> <tbody> <tr> <td class=\"esd-stripe\" style=\"background-color: #1976d2;\" esd-custom-block-id=\"6340\" bgcolor=\"#1976d2\" align=\"center\"> <table class=\"es-content-body\" style=\"background-color: transparent;\" width=\"600\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\"> <tbody> <tr> <td class=\"esd-structure\" align=\"left\"> <table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\"> <tbody> <tr> <td class=\"esd-container-frame\" width=\"600\" valign=\"top\" align=\"center\"> <table style=\"background-color: #ffffff; border-radius: 4px; border-collapse: separate;\" width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" bgcolor=\"#ffffff\"> <tbody> <tr> <td class=\"esd-block-text es-p35t es-p5b es-p30r es-p20l es-m-txt-c\" align=\"center\"> <h1 style=\"line-height: 120%; font-size: 35px;\">Recuperacion de contraseña</h1> </td> </tr> <tr> <td class=\"esd-block-spacer es-p5t es-p5b es-p20r es-p20l\" bgcolor=\"#ffffff\" align=\"center\" style=\"font-size:0\"> <table width=\"100%\" height=\"100%\" cellspacing=\"0\" cellpadding=\"0\" border=\"0\"> <tbody> <tr> <td style=\"border-bottom: 1px solid #ffffff; background: rgba(0, 0, 0, 0) none repeat scroll 0% 0%; height: 1px; width: 100%; margin: 0px;\"></td> </tr> </tbody> </table> </td> </tr> </tbody> </table> </td> </tr> </tbody> </table> </td> </tr> </tbody> </table> </td> </tr> </tbody> </table> <table class=\"es-content\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\"> <tbody> <tr> <td class=\"esd-stripe\" align=\"center\"> <table class=\"es-content-body\" style=\"background-color: #ffffff;\" width=\"600\" cellspacing=\"0\" cellpadding=\"0\" bgcolor=\"#ffffff\" align=\"center\"> <tbody> <tr> <td class=\"esd-structure\" align=\"left\"> <table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\"> <tbody> <tr> <td class=\"esd-container-frame\" width=\"600\" valign=\"top\" align=\"center\"> <table style=\"background-color: #ffffff;\" width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" bgcolor=\"#ffffff\"> <tbody> <tr> <td class=\"esd-block-text es-m-txt-l es-p40r es-p40l\" bgcolor=\"#ffffff\" align=\"left\"> <p>Buenas, "
							+ Parametros.getNombreUsuario()
							+ ", has solicitado recuperar tu contraseña.&nbsp;<br>Tu contraseña es:</p> </td> </tr> </tbody> </table> </td> </tr> </tbody> </table> </td> </tr> <tr> <td class=\"esd-structure\" align=\"left\"> <table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\"> <tbody> <tr> <td class=\"esd-container-frame\" width=\"600\" valign=\"top\" align=\"center\"> <table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\"> <tbody> <tr> <td class=\"esd-block-button es-p40t es-p40b es-p10r es-p10l\" align=\"center\"><span class=\"es-button-border\" style=\"display: block; border-width: 4px; border-color: #185c93; background: #1976d2;\"><a href class=\"es-button\" target=\"_blank\" style=\"background: #1976d2; border-color: #1976d2; border-left-width: 25px; border-right-width: 25px; display: block;\">"
							+ Parametros.getPasswordUsuario()
							+ "</a></span></td> </tr> </tbody> </table> </td> </tr> </tbody> </table> </td> </tr> </tbody> </table> </td> </tr> </tbody> </table> <table class=\"es-content esd-footer-popover\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\"> <tbody> <tr> <td class=\"esd-stripe\" esd-custom-block-id=\"6344\" align=\"center\"> <table class=\"es-content-body\" width=\"600\" cellspacing=\"0\" cellpadding=\"0\" bgcolor=\"#ffffff\" align=\"center\"> <tbody> <tr> <td class=\"esd-structure\" align=\"left\"> <table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\"> <tbody> <tr> <td class=\"esd-container-frame\" width=\"600\" valign=\"top\" align=\"center\"> <table style=\"border-radius: 4px; border-collapse: separate; background-color: #111111;\" width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" bgcolor=\"#111111\"> <tbody> <tr> <td class=\"esd-block-text es-p20t es-p30r es-p30l es-m-txt-l\" align=\"left\"> <p>Introduce este password para iniciar sesion en tu perfil de usuario.</p> </td> </tr> <tr> <td class=\"esd-block-text es-p20t es-p40b es-p30r es-p30l\" esdev-links-color=\"#7c72dc\" align=\"left\" esd-links-color=\"#50aae4\"><a target=\"_blank\" href style=\"color: #50aae4;\">No responda a este correo, gracias.</a></td> </tr> </tbody> </table> </td> </tr> </tbody> </table> </td> </tr> </tbody> </table> </td> </tr> </tbody> </table> </td> </tr> </tbody> </table> </div></body></html>");
			// email.setHtmlMsg("<h3>Saludos, "+Parametros.getNombreUsuario()+".</h3> <br>
			// Tu password es:<b>"+Parametros.getPasswordUsuario()+"</b><br> Introduce este
			// password para iniciar sesion</");
			email.send();
			Parametros.setPasswordUsuario("");
			Parametros.setCorreoUsuario("");
			Parametros.setNombreUsuario("");
			addComponent(new Iniciar_sesion());
			Notification.show("Contraseña enviada", "Revisa tu correo para obtener la contraseña",
					Notification.Type.WARNING_MESSAGE);

		} catch (EmailException e) {
			e.printStackTrace();
		}
	}
}