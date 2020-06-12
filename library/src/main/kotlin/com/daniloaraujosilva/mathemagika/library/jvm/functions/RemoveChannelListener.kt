package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             RemoveChannelListener
 *
 * Full name:        System`RemoveChannelListener
 *
 *                   RemoveChannelListener[obj] removes obj from the list of currently active channel listeners.
 *                   RemoveChannelListener[{obj , obj , …}] removes all the obj .
 *                                             1     2                         i
 * Usage:            RemoveChannelListener[] removes all currently active channel listeners.
 *
 * Options:
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/RemoveChannelListener
 * Documentation:    web: http://reference.wolfram.com/language/ref/RemoveChannelListener.html
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
fun removeChannelListener(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("RemoveChannelListener", arguments.toMutableList(), options)
}
