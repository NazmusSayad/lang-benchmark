run ./benchmark.py --bench-prefix=Python --clear=false --silent --exit
run ./benchmark.lua --bench-prefix=Lua --clear=false --silent --exit
run ./Benchmark.java --bench-prefix=Java --clear=false --silent --exit
run ./benchmark.js --bench-prefix=JavaScript-Node --clear=false --silent --exit
run exec bun run ./benchmark.js --bench-prefix=JavaScript-Bun --clear=false --silent --exit