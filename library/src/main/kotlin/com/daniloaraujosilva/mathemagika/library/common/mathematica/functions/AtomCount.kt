package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             AtomCount
 *
 * Full name:        System`AtomCount
 *
 *                   AtomCount[mol] gives the number of atoms in the molecule mol.
 * Usage:            AtomCount[mol, patt] gives the number of atoms in the molecule mol matching the atom pattern patt.
 *
 * Options:
 *
 * Attributes:
 *
 *                   local: paclet:ref/AtomCount
 * Documentation:    web: http://reference.wolfram.com/language/ref/AtomCount.html
 *
 * Definitions:      AtomCount[Chemistry`PatternMatching`Private`args___] := Module[{Chemistry`PatternMatching`Private`res}, Chemistry`PatternMatching`Private`res = Catch[Chemistry`PatternMatching`Private`iAtomCount[Chemistry`PatternMatching`Private`args], Chemistry`PatternMatching`Private`$tag]; Chemistry`PatternMatching`Private`res /; Chemistry`PatternMatching`Private`res =!= $Failed]
 *
 * Own values:       None
 *
 * Down values:      AtomCount[Chemistry`PatternMatching`Private`args___] := Module[{Chemistry`PatternMatching`Private`res}, Chemistry`PatternMatching`Private`res = Catch[Chemistry`PatternMatching`Private`iAtomCount[Chemistry`PatternMatching`Private`args], Chemistry`PatternMatching`Private`$tag]; Chemistry`PatternMatching`Private`res /; Chemistry`PatternMatching`Private`res =!= $Failed]
 *
 * Up values:        None
 *
 * Sub values:       None
 *
 * Default value:    None
 *
 * Numeric values:   None
 */
fun atomCount(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AtomCount", arguments.toMutableList(), options)
}
