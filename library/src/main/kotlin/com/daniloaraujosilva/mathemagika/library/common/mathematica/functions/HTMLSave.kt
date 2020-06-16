package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             HTMLSave
 *
 * Full name:        System`HTMLSave
 *
 *                   HTMLSave["file.html"] saves an HTML version of the current input notebook in the front end.
 *                   HTMLSave["file.html", "source.nb"] saves an HTML version of the notebook from the file source .nb.
 * Usage:            HTMLSave["file.html", notebook] saves an HTML version of the notebook corresponding to the specified notebook object.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/HTMLSave
 * Documentation:    web: http://reference.wolfram.com/language/ref/HTMLSave.html
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
fun hTMLSave(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("HTMLSave", arguments.toMutableList(), options)
}
