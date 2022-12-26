package appli_subtract_reinforce;

import javax.swing.*;

public class PanelApprentissage extends JPanel {

    public PanelApprentissage(){
        JLabel lbl = new JLabel("<html><head><style type=text/css>table, th, td {border:1px solid black;}</style><body>" +
                "<font size=+7><font color=red> C'est quoi un apprentissage par renforcement ?</font></font>" +
                "<br><p><font size=+1><b>Quel est le domaine concerné ?</b> <br>En Intelligence Artificielle (IA), plus précisément en apprentissage automatique.</font>" +
                "<p><font size=+1><b>Pour quel outil ?</b>" +
                "    <br>Un agent autonome : c'est un programme qui accomplit des tâches à la manière d'un automate et en fonction de ce que lui a demandé son auteur.</font>" +
                "<br><p><font size=+1><b>Quelques exemples d'agents autonomes :</b>" +
                "    <br>- agent robot : un agent logiciel intelligent qui est mobile dans le monde réel." +
                "    <br>- agent utilisateur : l'interface utilisateur pour une application réseau sophistiquée. Par exemple, le navigateur web." +
                "    <br>- agent système : il fonctionne de façon continue en tâche de fond sur le bureau." +
                "</font>" +
                "<br><p><font size=+1><b>Quel est le but de l'agent autonome ?</b>" +
                "    <br>Apprendre les actions à prendre, à partir d'expériences, de façon à optimiser une récompense quantitative au cours du temps." +
                "</font>" +
                "<br><p><font size=+1><b>Comment cette optimisation est-elle faite ?</b>" +
                "    <br>L'agent est plongé au sein d'un environnement et prend ses décisions en fonction de son état courant." +
                "    <br>En retour, l'environnement procure à l'agent une récompense, qui peut être positive ou négative." +
                "</font>" +
                "</html>");
        add(lbl);
    }
}