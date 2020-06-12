package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             AudioAnnotationLookup
 *
 * Full name:        System`AudioAnnotationLookup
 *
 *                   AudioAnnotationLookup[audio] gives all annotations associated to audio.
 *                   AudioAnnotationLookup[audio, tags] gives the annotations specified by tags.
 *                   AudioAnnotationLookup[audio, tags  selector] gives a selection of annotations using selector.
 * Usage:            AudioAnnotationLookup[audio, tags  selector, format] formats each annotation element according to format.
 *
 * Options:
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/AudioAnnotationLookup
 * Documentation:    web: http://reference.wolfram.com/language/ref/AudioAnnotationLookup.html
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
fun audioAnnotationLookup(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AudioAnnotationLookup", arguments.toMutableList(), options)
}
