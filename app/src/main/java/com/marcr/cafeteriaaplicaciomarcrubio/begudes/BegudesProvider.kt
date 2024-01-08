package com.marcr.cafeteriaaplicaciomarcrubio.begudes

import com.marcr.cafeteriaaplicaciomarcrubio.begudes.Begudes

class BegudesProvider {
    companion object{
        val begudesList = listOf<Begudes>(
            Begudes("Café Tallat", 1.0,"https://www.philips.es/c-dam/b2c/category-pages/Household/coffee/master/faq/cups/Productimg_Ristretto.png" ),
            Begudes("Café amb Llet", 1.10,"https://s3-eu-central-1.amazonaws.com/bk-uy-demo.menu.app/wp-media-folder-burger-king-uruguay//home/ubuntu/preview/menu-app/frontend/apps/marketing-website-wordpress-app/web/app/uploads/sites/27/cafe-con-leche.png" ),
            Begudes("Suc de Pinya", 1.20,"https://www.cateringencasa.com/wp-content/uploads/2017/08/Zumo-Pi%C3%B1a-768x897.jpg" ),
            Begudes("Suc de Prèssec", 1.20,"https://www.cateringencasa.com/wp-content/uploads/2017/08/Zumo-Melocoton.jpg" ),
            Begudes("Suc de Tronja", 1.20,"https://hydradrinks.es/1433-thickbox_default/juver-zumo-naranja-cristal-12x85cl.jpg" ),
            Begudes("Cacaolat", 1.50,"https://distribucionmayorista.online/5540-large_default/cacaolat-200ml.jpg" )
        )
    }
}