package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             AtomList
 *
 * Full name:        System`AtomList
 *
 *                   AtomList[mol] gives the list of atoms in the molecule mol.
 *                   AtomList[mol, patt] gives the list of atoms in the molecule mol matching the atom pattern patt.
 * Usage:            AtomList[mol, patt, "prop"] gives the value for the specified property of the atoms matching patt.
 *
 * Options:
 *
 * Attributes:
 *
 *                   local: paclet:ref/AtomList
 * Documentation:    web: http://reference.wolfram.com/language/ref/AtomList.html
 *
 * Definitions:      AtomList[Chemistry`PatternMatching`Private`args___] := Module[{Chemistry`PatternMatching`Private`argCheck, Chemistry`PatternMatching`Private`res}, Chemistry`PatternMatching`Private`argCheck = System`Private`ArgumentsWithRules[AtomList[Chemistry`PatternMatching`Private`args], {1, 3}]; (Chemistry`PatternMatching`Private`argCheck = Replace[Chemistry`PatternMatching`Private`argCheck, {{Chemistry`PatternMatching`Private`a_, {}}, Chemistry`PatternMatching`Private`b_} :> {{Chemistry`PatternMatching`Private`a}, Chemistry`PatternMatching`Private`b}]; Chemistry`PatternMatching`Private`res = Catch[Chemistry`PatternMatching`Private`iAtomList @@ Chemistry`PatternMatching`Private`argCheck, Chemistry`PatternMatching`Private`$tag]; Chemistry`PatternMatching`Private`res /; Chemistry`PatternMatching`Private`res =!= $Failed) /; MatchQ[Chemistry`PatternMatching`Private`argCheck, {_, _}]]
 *
 * Own values:       None
 *
 * Down values:      AtomList[Chemistry`PatternMatching`Private`args___] := Module[{Chemistry`PatternMatching`Private`argCheck, Chemistry`PatternMatching`Private`res}, Chemistry`PatternMatching`Private`argCheck = System`Private`ArgumentsWithRules[AtomList[Chemistry`PatternMatching`Private`args], {1, 3}]; (Chemistry`PatternMatching`Private`argCheck = Replace[Chemistry`PatternMatching`Private`argCheck, {{Chemistry`PatternMatching`Private`a_, {}}, Chemistry`PatternMatching`Private`b_} :> {{Chemistry`PatternMatching`Private`a}, Chemistry`PatternMatching`Private`b}]; Chemistry`PatternMatching`Private`res = Catch[Chemistry`PatternMatching`Private`iAtomList @@ Chemistry`PatternMatching`Private`argCheck, Chemistry`PatternMatching`Private`$tag]; Chemistry`PatternMatching`Private`res /; Chemistry`PatternMatching`Private`res =!= $Failed) /; MatchQ[Chemistry`PatternMatching`Private`argCheck, {_, _}]]
 *
 * Up values:        None
 *
 * Sub values:       None
 *
 * Default value:    None
 *
 * Numeric values:   None
 */
fun atomList(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AtomList", arguments.toMutableList(), options)
}
