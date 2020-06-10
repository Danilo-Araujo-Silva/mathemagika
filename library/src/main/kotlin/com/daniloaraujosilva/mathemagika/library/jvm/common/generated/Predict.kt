package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             Predict
 * 
 * Full name:        System`Predict
 * 
 *                   Predict[{in   out , in   out , …}] generates a PredictorFunction[…] based on the example input-output pairs given.
 *                              1      1    2      2
 *                   Predict[{in , in , …}  {out , out , …}] generates the same result.
 *                              1    2           1     2
 *                   Predict[training, input] attempts to predict the output associated with input from the training examples given.
 *                   Predict["name", input] uses the built-in predictor function represented by "name".
 * Usage:            Predict[predictor, opts] takes an existing predictor function and modifies it with the new options given.
 * 
 *                   AcceptanceThreshold -> Automatic
 *                   AnomalyDetector -> None
 *                   BatchProcessing -> Automatic
 *                   DistributionPostProcessing -> Automatic
 *                   FeatureExtractor -> Identity
 *                   FeatureNames -> Automatic
 *                   FeatureTypes -> Automatic
 *                   FeatureWeights -> Automatic
 *                   ImputeMissingValues -> True
 *                   IndeterminateThreshold -> Automatic
 *                   Method -> Automatic
 *                   NominalVariables -> Automatic
 *                   PerformanceGoal -> Automatic
 *                   PredictionName -> Automatic
 *                   ProcessorCaching -> True
 *                   RandomSeeding -> 1234
 *                   RecordLog -> True
 *                   TargetDevice -> CPU
 *                   TimeGoal -> Automatic
 *                   TrainingProgressCheckpointing -> None
 *                   TrainingProgressReporting -> Automatic
 *                   TrainingSizeRatio -> Automatic
 *                   UtilityFunction -> Automatic
 *                   ValidationSet -> Automatic
 *                   ValuePriors -> Automatic
 * Options:          Weights -> Automatic
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/Predict
 * Documentation:    web: http://reference.wolfram.com/language/ref/Predict.html
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
fun predict(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Predict", arguments.toMutableList(), options)
}
