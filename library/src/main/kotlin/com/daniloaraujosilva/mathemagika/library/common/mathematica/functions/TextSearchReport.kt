package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             TextSearchReport
 *
 * Full name:        System`TextSearchReport
 *
 * Usage:            TextSearchReport[source, form] gives a structured report of files referenced by source that contain text matching form.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/TextSearchReport
 * Documentation:    web: http://reference.wolfram.com/language/ref/TextSearchReport.html
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
 * Default value:    Options[TextSearchReport] := Options[TextSearch]
 *
 * Numeric values:   None
 */
fun textSearchReport(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TextSearchReport", arguments.toMutableList(), options)
}
