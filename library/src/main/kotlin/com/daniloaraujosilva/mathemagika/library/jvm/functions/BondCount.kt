package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             BondCount
 *
 * Full name:        System`BondCount
 *
 *                   BondCount[mol] gives the number of bonds in the molecule mol.
 * Usage:            BondCount[mol, patt] gives the number of bonds in the molecule mol matching the bond pattern patt.
 *
 * Options:
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/BondCount
 * Documentation:    web: http://reference.wolfram.com/language/ref/BondCount.html
 *
 * Definitions:      None
 *
 * Own values:       None
 *
 * Down values:      None
 *
 * Up values:        None
 *
 * Sub values:       None
 *
 * Default value:    None
 *
 * Numeric values:   None
 */
fun bondCount(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("BondCount", arguments.toMutableList(), options)
}
