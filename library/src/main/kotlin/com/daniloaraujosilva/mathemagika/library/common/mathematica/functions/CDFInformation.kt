package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             CDFInformation
 *
 * Full name:        System`CDFInformation
 *
 *                   CDFInformation[expr] gives a list of properties relevant to a CDF deployed with the content expr.
 *                   CDFInformation[notebook] gives usage properties for a CDF to be deployed from the given notebook.
 *                   CDFInformation[NotebookSelection[notebook]] gives CDF usage properties for only the selected cells in the given notebook.
 * Usage:            CDFInformation["file"] gives CDF usage properties for the named notebook or CDF file.
 *
 *                   AlternateImage -> False
 * Options:          WindowSize -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/CDFInformation
 * Documentation:    web: http://reference.wolfram.com/language/ref/CDFInformation.html
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
fun cDFInformation(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CDFInformation", arguments.toMutableList(), options)
}
