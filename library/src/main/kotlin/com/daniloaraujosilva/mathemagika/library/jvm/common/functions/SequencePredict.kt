package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             SequencePredict
 *
 * Full name:        System`SequencePredict
 *
 *                   SequencePredict[{seq , seq , …}] generates a SequencePredictorFunction[…] based on the sequences given.
 *                                       1     2
 *                   SequencePredict[training, seq] attempts to predict the next element in the sequence seq from the training sequences given.
 *                   SequencePredict[training, {seq , seq , …}] gives predictions for each of the sequences seq .
 *                                                 1     2                                                     i
 *                   SequencePredict["name", seq] uses the built-in sequence predictor represented by "name".
 * Usage:            SequencePredict[…, seq, prop] give the specified property of the prediction associated with seq.
 *
 *                   AssumeUnknownElements -> True
 *                   BatchProcessing -> Automatic
 *                   BeamSize -> 10
 *                   FeatureExtractor -> Identity
 *                   FeatureNames -> Automatic
 *                   FeatureTypes -> Automatic
 *                   ImputeMissingValues -> True
 *                   Method -> Automatic
 *                   PerformanceGoal -> Automatic
 *                   ProcessorCaching -> True
 *                   RandomSeeding -> 1234
 * Options:          RecordLog -> True
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SequencePredict
 * Documentation:    web: http://reference.wolfram.com/language/ref/SequencePredict.html
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
fun sequencePredict(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SequencePredict", arguments.toMutableList(), options)
}
