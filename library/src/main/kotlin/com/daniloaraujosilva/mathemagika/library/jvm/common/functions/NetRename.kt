package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             NetRename
 *
 * Full name:        System`NetRename
 *
 *                   NetRename[net, "old"  "new"] gives a net in which the name old for a layer is replaced with new.
 *                   NetRename[net, {rule , rule , …}] performs all renamings specified by the rule .
 *                                       1      2                                                  i
 * Usage:            NetRename[net, f] use a function f to map existing layer names to new names.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/NetRename
 * Documentation:    web: http://reference.wolfram.com/language/ref/NetRename.html
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
fun netRename(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NetRename", arguments.toMutableList(), options)
}
