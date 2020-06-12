package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             NetReplace
 *
 * Full name:        System`NetReplace
 *
 *                   NetReplace[net, patt  layer] gives a net in which all layers matching patt are replaced with layer.
 *                   NetReplace[net, {rule , rule , …}] performs all replacements specified by the rule .
 * Usage:                                 1      2                                                     i
 *
 * Options:          FlattenInPlace -> True
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/NetReplace
 * Documentation:    web: http://reference.wolfram.com/language/ref/NetReplace.html
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
fun netReplace(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NetReplace", arguments.toMutableList(), options)
}
