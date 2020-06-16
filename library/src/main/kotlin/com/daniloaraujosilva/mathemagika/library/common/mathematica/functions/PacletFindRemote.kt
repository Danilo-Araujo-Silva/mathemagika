package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             PacletFindRemote
 *
 * Full name:        System`PacletFindRemote
 *
 *                   PacletFindRemote["name"] gives a list of paclets that match "name" available on known paclet sites.
 *                   PacletFindRemote["name"  "version"] gives a list of paclets that match "name" and "version" available on known paclet sites.
 *                   PacletFindRemote["name",  prop   val , prop   val , … ] gives a list of paclets that match "name" and criteria given by the prop   val  available on known paclet sites.
 * Usage:                                           1      1      2      2                                                                               i      i
 *
 *                   UpdatePacletSites -> False
 *                   UpdateSites -> False
 *                   Location -> All
 *                   SystemID -> Automatic
 *                   WolframVersion -> Automatic
 *                   ProductID -> Automatic
 *                   Extension -> All
 *                   Loading -> All
 *                   Creator -> All
 *                   Publisher -> All
 *                   Context -> All
 * Options:          Internal -> All
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/PacletFindRemote
 * Documentation:    web: http://reference.wolfram.com/language/ref/PacletFindRemote.html
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
fun pacletFindRemote(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PacletFindRemote", arguments.toMutableList(), options)
}
