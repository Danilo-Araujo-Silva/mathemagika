package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             PacletFind
 *
 * Full name:        System`PacletFind
 *
 *                   PacletFind["name"] gives a list of installed paclets that match "name".
 *                   PacletFind["name"  "version"] gives a list of installed paclets that match "name" and "version".
 *                   PacletFind["name", <| prop   val , prop   val , …|>] gives a list of installed paclets that match "name" and criteria given by the prop   val .
 * Usage:                                      1      1      2      2                                                                                         i      i
 *
 *                   Location -> All
 *                   Qualifier -> All
 *                   SystemID -> Automatic
 *                   WolframVersion -> Automatic
 *                   ProductID -> Automatic
 *                   Enabled -> All
 *                   Extension -> All
 *                   Creator -> All
 *                   Publisher -> All
 *                   Context -> All
 *                   Loading -> All
 *                   Collections -> Automatic
 *                   IncludeDocPaclets -> False
 * Options:          Internal -> False
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/PacletFind
 * Documentation:    web: http://reference.wolfram.com/language/ref/PacletFind.html
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
fun pacletFind(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PacletFind", arguments.toMutableList(), options)
}
