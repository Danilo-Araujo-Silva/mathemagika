package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             TimeSeriesMapThread
 *
 * Full name:        System`TimeSeriesMapThread
 *
 *                   TimeSeriesMapThread[f, tseries] gives {{t , f[t , x ]}, {t , f[t , x ]}, …} for the time series tseries.
 *                                                            1     1   1      2     2   2
 *                   TimeSeriesMapThread[f, tseries, {{a , a , …}, {b , b , …}, …}] gives {{t , f[t , x , a , b , …]}, {t , f[t , x , a , b , …]}, …} for the time series tseries.
 * Usage:                                               1   2        1   2                   1     1   1   1   1         2     2   2   2   2
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/TimeSeriesMapThread
 * Documentation:    web: http://reference.wolfram.com/language/ref/TimeSeriesMapThread.html
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
fun timeSeriesMapThread(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TimeSeriesMapThread", arguments.toMutableList(), options)
}
