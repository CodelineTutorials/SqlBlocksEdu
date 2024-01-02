package de.luca.ui.input;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;

import java.security.Key;

public class KeyboardInputHandler {

    public static String getInput(KeyboardInputType inputType) {
        // Letters and All as KeyboardInputType
        if (inputType == KeyboardInputType.LETTERS || inputType == KeyboardInputType.ALL) {
            // space key
            if (Gdx.input.isKeyJustPressed(Input.Keys.SPACE)) return " ";
            // capitalized letters
            else if (Gdx.input.isKeyJustPressed(Input.Keys.A) && Gdx.input.isKeyPressed(Input.Keys.SHIFT_LEFT))
                return "A";
            else if (Gdx.input.isKeyJustPressed(Input.Keys.B) && Gdx.input.isKeyPressed(Input.Keys.SHIFT_LEFT))
                return "B";
            else if (Gdx.input.isKeyJustPressed(Input.Keys.C) && Gdx.input.isKeyPressed(Input.Keys.SHIFT_LEFT))
                return "C";
            else if (Gdx.input.isKeyJustPressed(Input.Keys.D) && Gdx.input.isKeyPressed(Input.Keys.SHIFT_LEFT))
                return "D";
            else if (Gdx.input.isKeyJustPressed(Input.Keys.E) && Gdx.input.isKeyPressed(Input.Keys.SHIFT_LEFT))
                return "E";
            else if (Gdx.input.isKeyJustPressed(Input.Keys.F) && Gdx.input.isKeyPressed(Input.Keys.SHIFT_LEFT))
                return "F";
            else if (Gdx.input.isKeyJustPressed(Input.Keys.G) && Gdx.input.isKeyPressed(Input.Keys.SHIFT_LEFT))
                return "G";
            else if (Gdx.input.isKeyJustPressed(Input.Keys.H) && Gdx.input.isKeyPressed(Input.Keys.SHIFT_LEFT))
                return "H";
            else if (Gdx.input.isKeyJustPressed(Input.Keys.I) && Gdx.input.isKeyPressed(Input.Keys.SHIFT_LEFT))
                return "I";
            else if (Gdx.input.isKeyJustPressed(Input.Keys.J) && Gdx.input.isKeyPressed(Input.Keys.SHIFT_LEFT))
                return "J";
            else if (Gdx.input.isKeyJustPressed(Input.Keys.K) && Gdx.input.isKeyPressed(Input.Keys.SHIFT_LEFT))
                return "K";
            else if (Gdx.input.isKeyJustPressed(Input.Keys.L) && Gdx.input.isKeyPressed(Input.Keys.SHIFT_LEFT))
                return "L";
            else if (Gdx.input.isKeyJustPressed(Input.Keys.M) && Gdx.input.isKeyPressed(Input.Keys.SHIFT_LEFT))
                return "M";
            else if (Gdx.input.isKeyJustPressed(Input.Keys.N) && Gdx.input.isKeyPressed(Input.Keys.SHIFT_LEFT))
                return "N";
            else if (Gdx.input.isKeyJustPressed(Input.Keys.O) && Gdx.input.isKeyPressed(Input.Keys.SHIFT_LEFT))
                return "O";
            else if (Gdx.input.isKeyJustPressed(Input.Keys.P) && Gdx.input.isKeyPressed(Input.Keys.SHIFT_LEFT))
                return "P";
            else if (Gdx.input.isKeyJustPressed(Input.Keys.Q) && Gdx.input.isKeyPressed(Input.Keys.SHIFT_LEFT))
                return "Q";
            else if (Gdx.input.isKeyJustPressed(Input.Keys.R) && Gdx.input.isKeyPressed(Input.Keys.SHIFT_LEFT))
                return "R";
            else if (Gdx.input.isKeyJustPressed(Input.Keys.S) && Gdx.input.isKeyPressed(Input.Keys.SHIFT_LEFT))
                return "S";
            else if (Gdx.input.isKeyJustPressed(Input.Keys.T) && Gdx.input.isKeyPressed(Input.Keys.SHIFT_LEFT))
                return "T";
            else if (Gdx.input.isKeyJustPressed(Input.Keys.U) && Gdx.input.isKeyPressed(Input.Keys.SHIFT_LEFT))
                return "U";
            else if (Gdx.input.isKeyJustPressed(Input.Keys.V) && Gdx.input.isKeyPressed(Input.Keys.SHIFT_LEFT))
                return "V";
            else if (Gdx.input.isKeyJustPressed(Input.Keys.W) && Gdx.input.isKeyPressed(Input.Keys.SHIFT_LEFT))
                return "W";
            else if (Gdx.input.isKeyJustPressed(Input.Keys.X) && Gdx.input.isKeyPressed(Input.Keys.SHIFT_LEFT))
                return "X";
            else if (Gdx.input.isKeyJustPressed(Input.Keys.Y) && Gdx.input.isKeyPressed(Input.Keys.SHIFT_LEFT))
                return "Y";
            else if (Gdx.input.isKeyJustPressed(Input.Keys.Z) && Gdx.input.isKeyPressed(Input.Keys.SHIFT_LEFT))
                return "Z";
            // not capitalized letters
            else if (Gdx.input.isKeyJustPressed(Input.Keys.A)) return "a";
            else if (Gdx.input.isKeyJustPressed(Input.Keys.B)) return "b";
            else if (Gdx.input.isKeyJustPressed(Input.Keys.C)) return "c";
            else if (Gdx.input.isKeyJustPressed(Input.Keys.D)) return "d";
            else if (Gdx.input.isKeyJustPressed(Input.Keys.E)) return "e";
            else if (Gdx.input.isKeyJustPressed(Input.Keys.F)) return "f";
            else if (Gdx.input.isKeyJustPressed(Input.Keys.G)) return "g";
            else if (Gdx.input.isKeyJustPressed(Input.Keys.H)) return "h";
            else if (Gdx.input.isKeyJustPressed(Input.Keys.I)) return "i";
            else if (Gdx.input.isKeyJustPressed(Input.Keys.J)) return "j";
            else if (Gdx.input.isKeyJustPressed(Input.Keys.K)) return "k";
            else if (Gdx.input.isKeyJustPressed(Input.Keys.L)) return "l";
            else if (Gdx.input.isKeyJustPressed(Input.Keys.M)) return "m";
            else if (Gdx.input.isKeyJustPressed(Input.Keys.N)) return "n";
            else if (Gdx.input.isKeyJustPressed(Input.Keys.O)) return "o";
            else if (Gdx.input.isKeyJustPressed(Input.Keys.P)) return "p";
            else if (Gdx.input.isKeyJustPressed(Input.Keys.Q)) return "q";
            else if (Gdx.input.isKeyJustPressed(Input.Keys.R)) return "r";
            else if (Gdx.input.isKeyJustPressed(Input.Keys.S)) return "s";
            else if (Gdx.input.isKeyJustPressed(Input.Keys.T)) return "t";
            else if (Gdx.input.isKeyJustPressed(Input.Keys.U)) return "u";
            else if (Gdx.input.isKeyJustPressed(Input.Keys.V)) return "v";
            else if (Gdx.input.isKeyJustPressed(Input.Keys.W)) return "w";
            else if (Gdx.input.isKeyJustPressed(Input.Keys.X)) return "x";
            else if (Gdx.input.isKeyJustPressed(Input.Keys.Y)) return "y";
            else if (Gdx.input.isKeyJustPressed(Input.Keys.Z)) return "z";
        }
        // Numbers, All as KeyboardInputType
        if (inputType == KeyboardInputType.NUMBERS || inputType == KeyboardInputType.ALL) {
            // numbers from 0 to 9 and basic math operators: + - * / (as well as . and ,)
            if (Gdx.input.isKeyJustPressed(Input.Keys.NUM_0) || Gdx.input.isKeyJustPressed(Input.Keys.NUMPAD_0))
                return "0";
            else if (Gdx.input.isKeyJustPressed(Input.Keys.NUM_1) || Gdx.input.isKeyJustPressed(Input.Keys.NUMPAD_1))
                return "1";
            else if (Gdx.input.isKeyJustPressed(Input.Keys.NUM_2) || Gdx.input.isKeyJustPressed(Input.Keys.NUMPAD_2))
                return "2";
            else if (Gdx.input.isKeyJustPressed(Input.Keys.NUM_3) || Gdx.input.isKeyJustPressed(Input.Keys.NUMPAD_3))
                return "3";
            else if (Gdx.input.isKeyJustPressed(Input.Keys.NUM_4) || Gdx.input.isKeyJustPressed(Input.Keys.NUMPAD_4))
                return "4";
            else if (Gdx.input.isKeyJustPressed(Input.Keys.NUM_5) || Gdx.input.isKeyJustPressed(Input.Keys.NUMPAD_5))
                return "5";
            else if (Gdx.input.isKeyJustPressed(Input.Keys.NUM_6) || Gdx.input.isKeyJustPressed(Input.Keys.NUMPAD_6))
                return "6";
            else if (Gdx.input.isKeyJustPressed(Input.Keys.NUM_7) || Gdx.input.isKeyJustPressed(Input.Keys.NUMPAD_7))
                return "7";
            else if (Gdx.input.isKeyJustPressed(Input.Keys.NUM_8) || Gdx.input.isKeyJustPressed(Input.Keys.NUMPAD_8))
                return "8";
            else if (Gdx.input.isKeyJustPressed(Input.Keys.NUM_9) || Gdx.input.isKeyJustPressed(Input.Keys.NUMPAD_9))
                return "9";
            else if (Gdx.input.isKeyJustPressed(Input.Keys.NUMPAD_ADD)) return "+";
            else if (Gdx.input.isKeyJustPressed(Input.Keys.NUMPAD_SUBTRACT)) return "-";
            else if (Gdx.input.isKeyJustPressed(Input.Keys.NUMPAD_MULTIPLY)) return "*";
            else if (Gdx.input.isKeyJustPressed(Input.Keys.NUMPAD_DIVIDE)) return "/";
            else if (Gdx.input.isKeyJustPressed(Input.Keys.NUMPAD_DOT) || Gdx.input.isKeyJustPressed(Input.Keys.COMMA)) return ".";
        }

        return "";
    }
}