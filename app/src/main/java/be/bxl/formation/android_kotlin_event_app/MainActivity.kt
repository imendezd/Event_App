package be.bxl.formation.android_kotlin_event_app

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import be.bxl.formation.android_kotlin_event_app.models.CustomEvent

class MainActivity : AppCompatActivity() {

    private var events: List<CustomEvent>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        events = ArrayList()
        //TODO Change from MainActivity to newEventfragment
    }
}

/*
Application d'encodage d'événement
****************************************

Écran principal :
- Interaction pour ajouter un événement
- La liste des événements du jour
   • Affichage de cartes d'évent (-> RecyclerView avec Card)
   • Message "Aucun événement prévu"
- L'affichage de la météo de la journée

Autres fonctionnalitées :
- Permet sur l'écran principal ou sur un nouvel écran de voir
  les événements planifier dans le futur.
- Permet d'éditer ou de supprimer un évent.
- Affichage de la météo
   • Avoir un affichage "discret"
   • Permet d'encoder sa ville
   • D'ouvrir un écran avec la météo des 5 prochains jours

Contrainte :
- Les evements doivent être stocker dans la base de donnée SQLite
- Utiliser des fragments (minimum 1)
- Langage Java ou Kotlin (au choix)
- Réaliser un code clair et compréhensible
- Utiliser (activement)

Donnée d'un evenement (vous pouvez aller plus loin) :
- Date
- Heure
- Description
- Lieu

Bonus :
- Rendre l'application mutli-langue (Français/Anglais)
- Permet à l'utilisateur de configurer la météo via la localisation GPS
- Créer deux types d'événement :
   • Date unique
   • Cyclique (tous les X du mois, tous les lundis, ...)
- Saluer personnellement (Nom?) l'utiliser à l'aide d'un Toast.
- Ajouter une détection de conflit avant d'ajouter un nouvel événement.
* */